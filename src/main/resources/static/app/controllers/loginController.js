angular.module('GestionFormation', ['ngRoute','ngCookies','base64'])
.config(function($routeProvider, $httpProvider) 
{

    $routeProvider.when('/app/views/', 
    {
      templateUrl : '/index.html',
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
.controller('loginController',['$rootScope', '$http', '$location','$scope','$cookies','$base64','properties','utils',function($rootScope, $http, $location,$scope,$cookies,$base64,properties,utils) 
{
    var self = this;
    var user;
    $scope.test = "mytest";
    $scope.credentials;
    $scope.error = null;
    
    var authenticate = function(credentials, callback) 
    {
        //console.log("authenticate");
        var headers = credentials ? {authorization : "Basic " + btoa(credentials.username + ":" + credentials.password) } : {};
           
        $http.get('/utilisateurs/user', {headers : headers}).then(function(response) 
        {
          console.log(response.message);
          if (response.data.name) 
          {
            $rootScope.authenticated = true;
            $rootScope.user = response.data;
            
            console.log("new cookie");
            $cookies.put('currentUser',$scope.coder());
            utils.redirectTo("/index.html");
            
          } 
          else 
          {
            $rootScope.authenticated = false;
            console.log("error");                
          }
          callback && callback();
        }, 
        function(response) 
        {
          $rootScope.authenticated = false;
          //console.log("not authenticated wrong login"+response.data.message);
          $scope.error = response.data.message;
          callback && callback();
        });
    };

  //authenticate();
  self.credentials = {};
  
  $scope.login = function() 
  {
      //console.log("login");
      $cookies.remove("currentUser");
      authenticate($scope.credentials, function() 
      {
        if ($rootScope.authenticated) 
        {
          //$location.path("/app/views/index.html");
          self.error = false;
        } 
        else 
        {
          //$location.path("/login");
          self.error = true;
          console.log("not authenticated");
        }
      });
  };
  
  self.logout = function() 
  {
    $http.post('logout', {}).finally(function() 
    {
        $rootScope.authenticated = false;
        $rootScope.user= null;
        //$cookies.remove("user");
        $location.path("/");
    
    });
  };
  
  $scope.coder = function()
  {
      return $base64.encode($scope.credentials.username + ":" + $scope.credentials.password);
  };
}]);


