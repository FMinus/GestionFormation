var myApp = angular.module("GestionFormation");
myApp.controller("listCollaborationController",['$http', '$scope','$rootScope', function($http, $scope,$rootScope)
    {
        $scope.test="myTest";
        $scope.collaboration;
        $scope.listFormations = [];
        $scope.pageCourante = 0;
        $scope.size = 3;
        $scope.pages = [];
        
        $scope.user;
        
        $rootScope.currentUser;
        
        
        $rootScope.$watch('currentUser',function()
        {
            $scope.user = $rootScope.currentUser;
            if($scope.user.emailUtilisateur != null)
                $scope.recherche();
        });
        
        $scope.goToPage = function(p)
        {
            $scope.pageCourante = p;
            $scope.recherche();
        };
        
        
        $scope.recherche = function()
        {
            $http.get("/utilisateurs/collaboration?email="+$scope.user.emailUtilisateur)
                    .success(function(data)
            {
                $scope.collaboration = data;
                $scope.pages = new Array(data.totalPages);
            });
            
            
            
        };
        
    }]);