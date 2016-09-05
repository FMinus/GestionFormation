var app=angular.module("GestionFormation");
app.controller("navigation",["currentUser","$scope","$http",'utils','properties','security','requester','HTTP_METHOD',function(currentUser,$scope,$http,utils,properties,security,requester,HTTP_METHOD)
    {
        $scope.test = "mytest";
        
        $scope.current = {};
        $scope.fullcurrent = {};
        
        
        $scope.testReq = {};
        
        
        
        
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
            //security.checkSecurity();
            var task = requester.getData("/utilisateurs/user",null,HTTP_METHOD.get,null);
            task.promise.then(function(result)
            {
                 //$scope.testReq  = angular.toJson(result);
                 //console.log( $scope.testReq );
                 console.log(angular.toJson(result));
            });

        };
        
        
        
        $scope.logout= function()
        {
            utils.deleteUserCookie();
            $http.post('/logout', {}).finally(function() 
            {
                $scope.current = null;
                utils.redirectTo("/login.html");
            });
            
        };
        
        $scope.isAdmin = function()
        {
            if($scope.current.roles == [] || $scope.current.roles == null)
            {
                return false;
            }
            else
            {
                for (i = 0; i < $scope.current.roles.length; i++) 
                { 
                    $scope.current.roles[i].nomRole == "ADMINISTRATEUR";
                    return true;
                }
            }
            return false;
        };
        
        /*        fetching user info from server        */
        $scope.getCurrent();
        $scope.getFullCurrent();
        
        $scope.testRequester = function()
        {
            //url,header,method,data,response
        };
        
    }]);