var app=angular.module("GestionFormation");
app.controller("utilisateur",["currentUser","$scope","$http",function(currentUser,$scope,$http)
{
    $scope.test = "mytest";
    $scope.user = currentUser.getCurrentUser();
    
    
}]);