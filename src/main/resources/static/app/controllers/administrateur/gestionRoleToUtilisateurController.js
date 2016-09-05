var myApp = angular.module("GestionFormation", []);
myApp.controller("gestionRoleToUtilisateurController", function($http, $scope)
{
    $scope.test = "mytest";
    $scope.errors = null;
    $scope.exception = {message:null};
    $scope.mode={value:"form"};
    
    $scope.user = 
    {
        idUtilisateur:null,
        roles:null
    };
   
    
    $scope.getUtilisateurs = function()
    {
         $http.get("/utilisateurs/listOnlyUsers")
                .success(function(data)
                {
                    $scope.optionsUtilisateurs = data;
                    
                });
        
    };
    
    $scope.getRoles = function()
    {
         $http.get("/roles/list")
                .success(function(data)
                {
                    $scope.optionsRoles = data;
                    console.log(data);
                });
        
    };
    
    $scope.valider = function()
    {
       $scope.user.roles = $scope.arrayRoles($scope.user.roles);
        
        $scope.user.idUtilisateur = parseInt($scope.user.idUtilisateur);
        
        $http
        ({
            method : 'post',
            url : "/utilisateurs/addRoleToUser",
            data : $scope.user,
            headers : {'Content-Type' : 'application/json'}
            
        });
       
        //console.log($scope.choixFormateurs);
        //console.log("adding roles "+$scope.userRole.roles);
        //console.log($scope.formation.responsableFormation.idUtilisateur);
        
    };
    
    $scope.arrayRoles = function(p)
    {
        var result = [];
        
        for (i = 0; i < p.length; i++) 
        { 
            result[i] = {nomRole:p[i]};
        }
        return result;
    };
    
    $scope.getUtilisateurs();
    $scope.getRoles();
});