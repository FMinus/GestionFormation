var app=angular.module("GestionFormation");
app.service('currentUser', ['$cookies','$base64',"$http",
    function ($cookies,$base64,$http) 
    {
        var currentUserReturn = {};
        
        var user = {};
        
        function getCurrentUserCode() 
        {
            user = $cookies.get('currentUser');
            return user;
            //console.log("current user " + user);
        }
        
        function getCurrentUser()
        {
            user = $cookies.get('currentUser');
            user = $base64.decode(user);
            var tab = user.split(":");
            var currentUser = {emailUtilisateur:tab[0],passwordUtilisateur:tab[1]};
            
            return currentUser;
        }
        
        function getCurrentUserFromServer()
        {
            user = getCurrentUser();
            var headers = user ? {authorization : "Basic " + btoa(user.emailUtilisateur + ":" + user.passwordUtilisateur) } : {};
            
            
            return $http
            ({
                method: 'POST',
                url: '/utilisateurs/getByCreds',
                headers : headers,
                data: user
            })
            .then
            (
                function(payload) 
                {
                    return payload.data;
                }
            );
    
            
           
        }
      
      
      
      
        return {
            getCurrentUser:getCurrentUser,
            getCurrentUserCode:getCurrentUserCode,
            getCurrentUserFromServer:getCurrentUserFromServer
        };
        
    }]);
