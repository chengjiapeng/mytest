/**
 * Created by chengjiapeng on 2017/3/29.
 */
var app = angular.module('actionApp', ['ngRoute']);
app.controller('View1Controller', function ($scope, $http) {
    $scope.search=function () {
        $http.get('/userList').then(function (response) {
            $scope.customers = response.data;
        })
    }
});

app.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/userList',{
        controller:'View1Controller',
        templateUrl: 'view1.html',
    });
}]);
