var app=angular.module("GestionFormation");
app.service('currentUser', ['$cookies',
    function ($cookies) 
    {
        var currentUserReturn = {};
        
        var user = {};
        
        currentUserReturn.getCurrentUser = function() 
        {
            user = $cookies.get('currentUser');
            console.log("current user " + user);
        };
        

        // --------------------- instance du service [security]
        return currentUserReturn;
        
    }]);
