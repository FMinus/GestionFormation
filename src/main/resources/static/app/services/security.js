var app=angular.module("GestionFormation");
app.factory('security',["currentUser","$http",'utils',function(currentUser,$http,utils)
    {
        var test = "security Test";
        var fullcurrent = {};
        
        function getTester()
        {
            return test;
        }
        
        
        
        function authorize() 
        {
            
        };
        
        
        function getFullCurrent()
        {
            currentUser.getCurrentUserCookie()
                    .then(function(data)
            {
                fullcurrent = data;
                console.log(data.authorities);
            });
        };
        
        //
        
        function checkSecurity()
        {   getFullCurrent();
            var roles = fullcurrent.authorities;
            
            
        };



    return{
        authorize:authorize,
        getTester:getTester,
        checkSecurity:checkSecurity
        };


}]);