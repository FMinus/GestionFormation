angular.module("app.directive.test")
        .directive("testDirectve",function()
{
    return{
        restrict: 'E',
        controller: function($scope)
        {
            alert("controller");
            console.log("test");
        }
        
    };
});