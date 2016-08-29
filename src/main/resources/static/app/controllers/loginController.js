angular.module("GestionFormation",[])
.controller("loginController",['currentUser','$scope','$http','$location', function(currentUser, $scope, $http,$location)
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
   
            //window.location.href="http://localhost:8080/app/views/index.html";
            console.log("login success : "+ $scope.utilisateur);
            
            //currentUser.saveCurrentUser(data);
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
