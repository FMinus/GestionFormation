var myApp = angular.module("GestionFormation", []);
myApp.controller("ajoutFormationController", function($http, $scope)
{
    $scope.test = "mytest";
    $scope.errors = null;
    $scope.exception = {message:null};
    $scope.mode={value:"form"};
    
    $scope.formation = 
    {
        nomFormation : "",
        Description: "",
        dateFormation: "",
        responsableFormation: 
        {
            idUtilisateur: null
        },
        collaborateurs : null,
       
        sessionFormations : null
    };
    
    //données a fournir au formulaire de la BD
    //$scope.optionsUtilisateurs = [];
    
    
    
    //choix fait
    $scope.choixFormateurs = null;
    
    
    
    $scope.testFunc= function()
    {
        
    };
    
    $scope.getUtilisateurs = function()
    {
         $http.get("/utilisateurs/list")
                .success(function(data)
                {
                    $scope.optionsUtilisateurs = data;
                    
                });
        
    };
    
    $scope.valider = function()
    {
        $scope.formation.collaborateurs = $scope.arrayIdUsers($scope.formation.collaborateurs);
       
        
        $http
        ({
            method : 'post',
            url : "/formations/creer",
            data : $scope.formation,
            headers : {'Content-Type' : 'application/json'}
            
        });
       
        //console.log($scope.choixFormateurs);
        console.log();
        //console.log($scope.formation.responsableFormation.idUtilisateur);
        
    };
    
    $scope.arrayIdUsers = function(p)
    {
        var result = [];
        
        for (i = 0; i < p.length; i++) 
        { 
            result[i] = {idUtilisateur:parseInt(p[i])};
        }
        return result;
    };
    
    $scope.getUtilisateurs();
});