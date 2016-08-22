

var myApp = angular.module("GestionFormation", []);
myApp.controller("ajouterUtilisateurController", function($http, $scope)
{
    $scope.utilisateur = {};
    $scope.errorMessage = null;
    $scope.exception = {message:null};
    
    
    $scope.ajouterUtilisateur = function()
    {
        $http.post("saveEtudiant",$scope.etudiant)
                .success(function(data)
        {
            if(!data.errors)
            {
                $scope.etudiant = data;
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