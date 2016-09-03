angular.module('GestionFormation')
.controller('indexController',['$rootScope', '$http', '$location','$scope',function($rootScope, $http, $location,$scope) 
{
    $scope.test = "mytest";
    
    $scope.tabs = 
            [
                { title:'Login', content:'Login Form', url: 'login.html'},
                { title:'Register', content:'Register Form',url: 'register.html'}
            ];
    
 
    $scope.loadPage = function(index) 
    {
         console.log(tabs[index]);
    
    };
    
  $scope.model = {
    name: 'Tabs'
  };
    
}]);





