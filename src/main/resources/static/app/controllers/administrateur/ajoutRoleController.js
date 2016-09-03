var myApp = angular.module("GestionFormation", []);
myApp.controller("ajoutRoleController", function($http, $scope)
{
    $scope.test = "mytest";
    $scope.errors = null;
    $scope.exception = {message:null};
    $scope.mode={value:"form"};
    
    $scope.role = 
    {
        nomRole : "",
        description: ""
    };
   
   
    
    
    
    $scope.testFunc= function()
    {
        
    };
    
    
    
    $scope.valider = function()
    {
        $http
        ({
            method : 'post',
            url : "/roles/ajout",
            data : $scope.role,
            headers : {'Content-Type' : 'application/json'}
            
        });
       
    };
    
    
});