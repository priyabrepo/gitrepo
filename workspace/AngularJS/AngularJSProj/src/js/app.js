var myApp = angular.module('myApp',[]);

myApp.controller('mainController',['$scope','$filter',
	function($scope,$filter){
	
	$scope.firstname = "Priyab";
	$scope.lasttname = "Biswal";
	$scope.username ="";
	
	$scope.lowercaseHandle = function()
	{
		return $filter('lowercase')($scope.username);
	}
	
	
	
}]);