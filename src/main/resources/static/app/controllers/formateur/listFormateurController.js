var myApp = angular.module("GestionFormation");
myApp.controller("listFormateurController",['$http', '$scope','$rootScope', function($http, $scope,$rootScope)
    {
        $scope.test="myTest";
        $scope.formateur;
        $scope.user;
        $rootScope.currentUser;
        
        
        $rootScope.$watch('currentUser',function()
        {
            $scope.user = $rootScope.currentUser;
            if($scope.user.emailUtilisateur != null)
                $scope.getFormateur();
        });
        
        $scope.getFormateur = function()
        {
            $http.get("/formateurs/findByEmail?email="+$scope.user.emailUtilisateur)
                    .success(function(data)
            {
                $scope.formateur = data;
               
            });
        };
        
        $scope.getAbsences = function(idSession)
        {
            $http.get("/formateurs/findByEmail?email="+$scope.user.emailUtilisateur)
                    .success(function(data)
            {
                $scope.formateur = data;
               
            });
        };
    }]);