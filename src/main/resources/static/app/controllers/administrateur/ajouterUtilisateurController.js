
var myApp = angular.module("GestionFormation",[]);
myApp.controller("ajouterUtilisateurController", function($http, $scope)
{
    $scope.test="myTest";
    
    
    $scope.utilisateur = {};
    $scope.errors = null;
    $scope.exception = {message:null};
    $scope.mode={value:"form"};
    
    $scope.ajouterUtilisateur = function()
    {
        $http.post("/utilisateurs/ajout",$scope.utilisateur)
        .success(function(data)
        {
            if(!data.errors)
            {
                $scope.utilisateur = data;
                $scope.errors = null;
                $scope.mode.value = "confirm";
            }
            else
            {
                //$scope.etudiant = null;
                $scope.errors = data;
            }
            
        })
        .error(function(data)
        {
            $scope.exception.message = data.message;
        });
    };
    
});