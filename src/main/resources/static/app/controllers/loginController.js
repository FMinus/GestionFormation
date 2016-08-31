angular.module("GestionFormation",['ngStorage'])
.controller("loginController",['currentUser','$scope','$http','$location','$rootScope', function(currentUser, $scope, $http,$location,$rootScope,$localStorage,$sessionStorage)
{
    $scope.test = "mytest";
    $scope.user = 
            {
                emailUtilisateur:"user1@mail.com",
                passwordUtilisateur:"123"
    };
    
    $scope.utilisateur = null;
    $scope.error = null;
    
    
    //var self = this;
    //$scope.$storage = $sessionStorage;
    
    $scope.authenticate  = function()
    {
        $scope.error = null;
        $http
        ({
            method : 'post',
            url : "/utilisateurs/login",
            data : $scope.user,
            headers : {'Content-Type' : 'application/json'}
            
        })
        .success(function(data)
        {
            
            $scope.utilisateur = data;
            $rootScope.utilisateur = data;
           
            window.location.href="http://localhost:8080/app/views/index.html";
            console.log("login success : "+ $scope.utilisateur);
            
            //currentUser.saveCurrentUser(data);
            
            //$scope.$storage.sessionuser = data;
            
        })
        .error(function(data)
        {
            
            console.log(data.message);
            $scope.error = data.message;
            //$rootScope.authenticated = false;
            
        });
    };
    
    $scope.toIndex = function()
    {
        $location.host("http://localhost:8080/");
        $location.url("/index.html");
    };
    
    
    
}])
    ;
