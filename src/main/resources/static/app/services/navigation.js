var app=angular.module("GestionFormation");
app.controller("navigation",["currentUser","$scope","$http",'utils','properties',function(currentUser,$scope,$http,utils,properties)
    {
        $scope.test = "mytest";
        
        $scope.current = {};
        
        
        //
        
        
        
        
        
        $scope.getCurrent = function()
        {
            currentUser.getCurrentUserFromServer()
                    .then(function(data)
            {
                $scope.current = data;
            });
        };
        
        $scope.testo = function()
        {
            console.log("testo");
        };
        
        $scope.getCurrent();
        
        
        $scope.logout= function()
        {
            utils.deleteUserCookie();
            $http.post('logout', {}).finally(function() 
            {
                $scope.current = null;
                utils.redirectTo("/login.html");
            });
    
        };
    }]);