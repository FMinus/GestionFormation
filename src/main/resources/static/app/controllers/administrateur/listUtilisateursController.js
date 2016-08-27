var myApp = angular.module("GestionFormation", []);
myApp.controller("listUtilisateursController", function($http, $scope)
{
    $scope.test="myTest";
    $scope.pageUtilisateurs = [];
    $scope.pageCourante = 0;
    $scope.size = 3;
    $scope.pages = [];
     
    $scope.listUtilisateurs = function()
    {
        
        $http.get("/utilisateurs/pageUsers?page="+$scope.pageCourante+"&size="+$scope.size)
                .success(function(data)
                {
                    $scope.pageUtilisateurs = data;
                    $scope.pages = new Array(data.totalPages);
                });
    };
    
     $scope.goToPage = function(p)
    {
        $scope.pageCourante = p;
        $scope.recherche();
        //$scope.listUtilisateurs();
        
    };
    
    //$scope.listUtilisateurs();
    
    
    
    
    //partie recherche 
    $scope.motCle = "";
    $scope.recherche = function()
    {
        $http.get("/utilisateurs/pageUsersOnly?page="+$scope.pageCourante+"&size="+$scope.size+"&mc="+$scope.motCle)
                .success(function(data)
                {
                    $scope.pageUtilisateurs = data;
                    $scope.pages = new Array(data.totalPages);
                });
        
    };
    
    $scope.recherche();
});