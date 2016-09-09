var myApp = angular.module("GestionFormation");
myApp.controller("resumeFormationController", function($http, $scope)
{
    $scope.test = "myTest";
    
    $scope.pageFormations = [];
    $scope.pageCourante = 0;
    $scope.size = 3;
    $scope.pages = [];
    $scope.motCle = "";
    
    
    $scope.listFormations = function()
    {
        
        $http.get("/formations/list")
                .success(function(data)
                {
                    $scope.pageFormations = data;
                    $scope.pages = new Array(data.totalPages);
                });
    };
    
   
    
     $scope.goToPage = function(p)
    {
        $scope.pageCourante = p;
        $scope.recherche();
    };
    
    //partie recherche 
    $scope.recherche = function()
    {
        $http.get("/formations/pageFormations?page="+$scope.pageCourante+"&size="+$scope.size+"&mc="+$scope.motCle)
                .success(function(data)
                {
                    $scope.pageFormations = data;
                    $scope.pages = new Array(data.totalPages);
                });
        
    };
    
    //$scope.recherche();
    $scope.listFormations();
});