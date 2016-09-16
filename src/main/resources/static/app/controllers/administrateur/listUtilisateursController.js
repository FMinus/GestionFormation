var myApp = angular.module("GestionFormation");
myApp.controller("listUtilisateursController", function($http, $scope)
{
    $scope.test="myTest";
    $scope.pageUtilisateurs = [];
    $scope.pageCourante = 0;
    $scope.size = 5;
    $scope.pages = [];
    $scope.motCle = "";
    
    
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
    
    $scope.test = function(i)
    {
        console.log("click : "+i);
    };
    
    $scope.SupprimerUser = function(i)
    {
        $http.delete("/utilisateurs/supprimer?id="+parseInt(i))
                .success(function(data)
        {
            $scope.recherche();
        });
        
    };
    
    
    
    //partie recherche 
    
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