var myApp = angular.module("GestionFormation");
myApp.controller("listResponsablesController",['$http', '$scope','$rootScope', function($http, $scope,$rootScope)
    {
        $scope.test="myTest";
        $scope.responsable;
        $scope.listFormations = [];
        $scope.pageCourante = 0;
        $scope.size = 3;
        $scope.pages = [];
        $scope.motCle = "user1@mail.com";
        
        $rootScope.currentUser;
        
        
        $rootScope.$watch('currentUser',function()
        {
            $scope.user = $rootScope.currentUser;
            if($scope.user.emailUtilisateur != null)
                $scope.recherche();
        });
        
//        $scope.goToPage = function(p)
//        {
//            $scope.pageCourante = p;
//            $scope.recherche();
//        };
        
        
        $scope.recherche = function()
        {
            $http.get("/responsableformations/findByEmail?email="+$scope.user.emailUtilisateur)
                    .success(function(data)
            {
                $scope.responsable = data;
                //$scope.pages = new Array(data.totalPages);
            });
            
            
            
        };
        //$scope.recherche();
    }]);