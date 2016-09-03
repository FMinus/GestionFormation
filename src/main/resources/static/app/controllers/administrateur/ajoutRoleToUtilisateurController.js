var myApp = angular.module("GestionFormation", []);
myApp.controller("ajoutRoleToUtilisateurController", function($http, $scope)
{
    $scope.test = "mytest";
    $scope.errors = null;
    $scope.exception = {message:null};
    $scope.mode={value:"form"};
    
    $scope.userRole = 
    {
        iduser:null,
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
                    
                });
        
    };
    
    $scope.valider = function()
    {
        //$scope.formation.collaborateurs = $scope.arrayIdUsers($scope.formation.collaborateurs);
        $http
        ({
            method : 'post',
            url : "/utilisateurs/addRoleToUser",
            data : {idUser:$scope.userRole.iduser,roles:$scope.userRole.roles},
            headers : {'Content-Type' : 'application/json'}
            
        });
       
        //console.log($scope.choixFormateurs);
        console.log("adding roles "+$scope.userRole.roles);
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
    $scope.getRoles();
});