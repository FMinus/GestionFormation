var app=angular.module("GestionFormation");
app.controller("utilisateur",["currentUser","$scope","$http",function(currentUser,$scope,$http)
{
    $scope.test = "mytest";
    $scope.user = currentUser.getCurrentUser();
    $scope.current = {};
    
    //
    
    
    
    
    $scope.getCurrent = function (data)
    {
       $scope.current = data;
    };
    
    $scope.testo = function()
    {
        console.log("testo");
        currentUser.getCurrentUserFromServer()
                .then(function(data)
                {
                    console.log(data);
                    $scope.current = data;
                });
   };
    
    
}]);