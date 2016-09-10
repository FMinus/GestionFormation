var myApp = angular.module("GestionFormation");
myApp.controller("listCollaborationController", function($http, $scope)
{
    $scope.test="myTest";
    $scope.pageCollaboration = [];
    $scope.listFormations = [];
    $scope.pageCourante = 0;
    $scope.size = 3;
    $scope.pages = [];
    $scope.motCle = "";
    
    
    $scope.listUtilisateurs = function()
    {
        
        $http.get("/utilisateurs/collaboration?email="+$scope.pageCourante+"&size="+$scope.size)
                .success(function(data)
                {
                    $scope.pageCollaboration = data;
                    $scope.pages = new Array(data.totalPages);
                });
    };
    
    $scope.listFormations = function(email)
    {
        
        $http.get("/utilisateurs/collaborationFormation?email="+email)
                .success(function(data)
                {
                    return data;
                });
    };
    
     $scope.goToPage = function(p)
    {
        $scope.pageCourante = p;
        $scope.recherche();
        //$scope.listUtilisateurs();
        
    };
    
  
    $scope.recherche = function()
    {
        $http.get("/utilisateurs/collaboration?email="+$scope.motCle)
                .success(function(data)
                {
                    $scope.pageCollaboration = data;
                    $scope.pages = new Array(data.totalPages);
                });
        
    };
    
    $scope.recherche();
});