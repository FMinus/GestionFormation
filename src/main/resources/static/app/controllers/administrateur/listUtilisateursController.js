var myApp = angular.module("GestionFormation", []);
myApp.controller("listUtilisateursController", function($http, $scope)
{
    $scope.test="myTest";
    $scope.pageUtilisateurs = null;
    $scope.pageCourante = 0;
    $scope.size = 5;
    
    $scope.listUtilisateurs = function()
    {
        $http.get("/listUtilisateurs?page="+$scope.pageCourante+"&size="+$scope.size)
                .success(function(data)
                {
                    $scope.pageUtilisateurs = data;
                });
    };
    
    $scope.listUtilisateurs();
});