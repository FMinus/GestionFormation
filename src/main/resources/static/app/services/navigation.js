var app=angular.module("GestionFormation");
app.controller("navigation",["currentUser","$scope","$http",'utils','properties','security',function(currentUser,$scope,$http,utils,properties,security)
    {
        $scope.test = "mytest";
        
        $scope.current = {};
        $scope.fullcurrent = {};
        
        
        
        $scope.getCurrent = function()
        {
            currentUser.getCurrentUserFromServer()
                    .then(function(data)
            {
                $scope.current = data;
            });
        };
        
        $scope.getFullCurrent = function()
        {
            currentUser.getCurrentUserCookie()
                    .then(function(data)
            {
                $scope.fullcurrent = data;
            });
        };
        
        
        
        $scope.testo = function()
        {
           
            //console.log($scope.fullcurrent);
            security.checkSecurity();
        };
        
        $scope.getCurrent();
        $scope.getFullCurrent();
        
        $scope.logout= function()
        {
            utils.deleteUserCookie();
            $http.post('/logout', {}).finally(function() 
            {
                $scope.current = null;
                utils.redirectTo("/login.html");
            });
    
        };
    }]);