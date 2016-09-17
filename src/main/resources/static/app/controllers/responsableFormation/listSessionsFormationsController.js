var myApp = angular.module("GestionFormation");
myApp.controller("listSessionsFormationsController", function($http, $scope)
{
    $scope.test="myTest";
    $scope.pageSessions = [];
    $scope.pageCourante = 0;
    $scope.size = 5;
    $scope.pages = [];
    $scope.motCle = "";
    $scope.listFormation = [];
    
    $scope.goToPage = function(p)
    {
        $scope.pageCourante = p;
        $scope.recherche();
        
    };
    
    
    
    $scope.Supprimer = function(i)
    {
        $http.delete("/utilisateurs/supprimer?id="+parseInt(i))
                .success(function(data)
        {
            $scope.recherche();
        });
        
    };
    
    
    $scope.recherche = function()
    {
        $http.get("/sessionFormations/pageByNomFormation?page="+$scope.pageCourante+"&size="+$scope.size+"&nomFormation="+$scope.motCle)
                .success(function(data)
        {
            $scope.pageSessions = data.content;
            $scope.pages = new Array(data.totalPages);
        });
        
    };
    
    //$scope.recherche();
    
    
    $scope.getFormations = function()
    {
        $http.get("/formations/list")
                .success(function(data)
        {
            $scope.listFormation = data;
            
        });
    };
    $scope.getFormations();
    
    
});