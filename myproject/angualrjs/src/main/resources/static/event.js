/**
 * Created by chengjiapeng on 2017/3/29.
 */
var app = angular.module('myEvent', []);

app.controller('personCtrl', function ($scope) {
    $scope.myVar = false;
    $scope.toggle = function () {
        $scope.myVar = !$scope.myVar;
    };
});