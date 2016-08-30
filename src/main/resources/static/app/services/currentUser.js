/*

var myApp=angular.module('GestionFormation');

myApp.factory('currentUser', ['$location',function () 
    {
        var user = {};
        
        function getCurrentUser() 
        {
            return user;
        }
        
        function saveCurrentUser(creds)
        {
            user = creds;
            console.log(creds);
        }
        
        return 
        {
           getCurrentUser:getCurrentUser,
           saveCurrentUser,saveCurrentUser
        };
        
    }]);
 */
var app=angular.module("GestionFormation");
app.factory('currentUser', [
    function () 
    {
        var user = {};

        function getCurrentUser() 
        {
            return user;
        }
        
        function saveCurrentUser(creds)
        {
            user = creds;
            console.log(creds);
        }

        // --------------------- instance du service [security]
        return {
            getCurrentUser:getCurrentUser,
            saveCurrentUser:saveCurrentUser
               
        }
    }]);
