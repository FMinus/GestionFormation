var myApp = angular.module("GestionFormation", []);
myApp.controller("listCollaborateursController", function($http, $scope)
{
    $scope.test="myTest";
    $scope.pageUtilisateurs = [];
    $scope.pageCourante = 0;
    $scope.size = 2;
     $scope.pages = [];
     
    $scope.listCollaborateurs = function()
    {
        
        $http.get("/collaborateurs/pageCollaborateursOnly?page="+$scope.pageCourante+"&size="+$scope.size)
                .success(function(data)
                {
                    $scope.pageUtilisateurs = data;
                    $scope.pages = new Array(data.totalPages);
                });
    };
    
     $scope.goToPage = function(p)
    {
        $scope.pageCourante = p;
        $scope.listUtilisateurs();
    };
    
    $scope.listCollaborateurs();
});