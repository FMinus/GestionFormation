/*
angular.module('GestionFormation', [ 'ngRoute' ])
 .config(function($routeProvider, $httpProvider) {

    $routeProvider.when('/', {
      templateUrl : 'home.html',
      controller : 'home',
      controllerAs: 'controller'
    }).when('/login', {
      templateUrl : 'login.html',
      controller : 'navigation',
      controllerAs: 'controller'
    }).otherwise('/');

    $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';

  })// ... omitted code
.controller('navigation',

  function($rootScope, $http, $location) {

  var self = this;

  var authenticate = function(credentials, callback) 
  {

    var headers = credentials ? {authorization : "Basic "
        + btoa(credentials.emailUtilisateur + ":" + credentials.passwordUtilisateur)
    } : {};

    $http.get('/utilisateurs/login', {headers : headers}).then(function(response) 
    {
      if (!response.data.message) 
      {
        $rootScope.authenticated = true;
      }
      else 
      {
        $rootScope.authenticated = false;
      }
      callback && callback();
    }, function() 
    {
      $rootScope.authenticated = false;
      callback && callback();
    });

  };

  authenticate();
  self.credentials = {};
  self.login = function() 
  {
      authenticate(self.credentials, function() 
      {
        if ($rootScope.authenticated) 
        {
          $location.path("/");
          self.error = false;
        } 
        else 
        {
          $location.path("/login");
          self.error = true;
        }
      });
  };
});

*/

angular.module("GestionFormation",[])
.controller("navigation",['currentUser','$scope','$http','$location', function(currentUser, $scope, $http,$location)
{
    $scope.test = "mytest";
    $scope.user = currentUser.getCurrentUser();
           
    
    $scope.utilisateur = null;
    $scope.error = null;
    
    //var self = this;
    
    
    
    
    
}])
    ;
