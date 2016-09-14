var myApp = angular.module("GestionFormation");
myApp.controller("listCollaborationController",['$http', '$scope','$rootScope', function($http, $scope,$rootScope)
    {
        $scope.test="myTest";
        $scope.pageCollaboration = [];
        $scope.listFormations = [];
        $scope.pageCourante = 0;
        $scope.size = 3;
        $scope.pages = [];
        $scope.motCle = "user1User@mail.com";
        
        $rootScope.currentUser;
        
        
        $rootScope.$watch('currentUser',function()
        {
            $scope.user = $rootScope.currentUser;
            //$scope.motCle = $rootScope.currentUser.emailUtilisateur;
        });
        
        $scope.goToPage = function(p)
        {
            $scope.pageCourante = p;
            $scope.recherche();
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
    }]);