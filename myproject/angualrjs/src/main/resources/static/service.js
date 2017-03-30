/**
 * Created by chengjiapeng on 2017/3/29.
 */
var app = angular.module('myService', []);
app.controller('serviceCtrl', function($scope, $interval, hexafy){
    $scope.theTime = new Date().toLocaleTimeString();
    $interval(function() {
        $scope.theTime = new Date().toLocaleTimeString();
    }, 1000);

    $scope.hex = hexafy.myFunc(255);

    $scope.names = ["Google", "Runoob", "Taobao"];

    $scope.sites = [
        {site : "Google", url : "http://www.google.com"},
        {site : "Runoob", url : "http://www.runoob.com"},
        {site : "Taobao", url : "http://www.taobao.com"}
    ];

    $scope.cars = {
        car01 : {brand : "Ford", model : "Mustang", color : "red"},
        car02 : {brand : "Fiat", model : "500", color : "white"},
        car03 : {brand : "Volvo", model : "XC90", color : "black"}
    };
});

app.service('hexafy', function() {
    this.myFunc = function (x) {
        return x.toString(16);
    }
});