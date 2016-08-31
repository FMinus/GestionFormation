var app=angular.module("GestionFormation",[]);
app.controller("utilisateur",function($scope,$http)
{
    $scope.test = "mytest";
    $scope.user = {};
    
    $scope.getUser  = function()
    {
        
        $http
        ({
            method : 'get',
            url : "/utilisateurs/currentUser",
            headers : {'Content-Type' : 'application/json'}
            
        })
        .success(function(data)
        {
            $scope.user = data;
            console.log("login success : "+ $scope.user);
            
        })
        .error(function(data)
        {
            console.log(data.message);
        });
    };
    
    $scope.getUser();
});