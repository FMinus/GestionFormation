angular.module('GestionFormation', ['ngRoute','ngCookies','base64'])
.config(function($routeProvider, $httpProvider) 
{

    $routeProvider.when('/', 
    {
      templateUrl : '/app/views/index.html',
      controller : 'home',
      controllerAs: 'controller'
    })
    .when('/login2', {
      templateUrl : '/app/views/login2.html',
      controller : 'navigation',
      controllerAs: 'controller'
    }).otherwise('/');

    $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';

  })
.controller('navigation',['$rootScope', '$http', '$location','$scope','$cookies','$base64',function($rootScope, $http, $location,$scope,$cookies,$base64) 
{
    var self = this;
    var user;
    var test = "mytest";
    $scope.credentials;
    
    var authenticate = function(credentials, callback) 
    {
        console.log("authenticate");
        var headers = credentials ? {authorization : "Basic " + btoa(credentials.username + ":" + credentials.password) } : {};
           
        $http.get('/utilisateurs/user', {headers : headers}).then(function(response) 
        {
          if (response.data.name) 
          {
            $rootScope.authenticated = true;
            $rootScope.user = response.data;
            console.log("new cookie");
            $cookies.put('currentUser',$scope.coder());
          } 
          else 
          {
            $rootScope.authenticated = false;
            console.log("not authenticated");
          }
          callback && callback();
        }, 
        function() 
        {
          $rootScope.authenticated = false;
          callback && callback();
        });
    };

  authenticate();
  self.credentials = {};
  
  $scope.login = function() 
  {
      console.log("login");
      
      authenticate($scope.credentials, function() 
      {
        if ($rootScope.authenticated) 
        {
          $location.path("/app/views/index.html");
          self.error = false;
        } 
        else 
        {
          $location.path("/login");
          self.error = true;
        }
      });
  };
  
  self.logout = function() 
  {
    $http.post('logout', {}).finally(function() 
    {
        $rootScope.authenticated = false;
        $rootScope.user= null;
        $location.path("/");
    
    });
  };
  
  $scope.coder = function()
  {
      return $base64.encode($scope.credentials.username + ":" + $scope.credentials.password);
  };
}]);


