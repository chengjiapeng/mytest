/**
 * Created by chengjiapeng on 2017/3/28.
 */
var app = angular.module('myApp', []);
app.controller('myCtrl', function ($scope, $location, $http, $timeout) {
    $scope.firstName="John";
    $scope.lastName="Doe";
    // $scope.quantity=100;
    // $scope.price=8;
    $scope.myUrl=$location.absUrl();
    $scope.fullName=function () {
        return $scope.firstName  + " " + $scope.lastName;
    }
    $scope.sayHello=function () {
        return $scope.greeting = 'Hello'+$scope.firstName;
    }
    $scope.welcome=function () {
        // $http({
        //     method: 'GET',
        //     url: 'http://localhost:8080/welcome'
        // }).then(function successCallback(response) {
        //     $scope.myWelcome = response.data;
        // }, function errorCallback(response) {
        //     // 请求失败执行代码
        // });
        $http.get("/welcome").then(function(response){
            $scope.myWelcome = response.data.content;
            $timeout(function () {
                $scope.result="the result has been loaded";
            }, 2000)
        })
    }


});

app.directive("runoobDirective", function() {
    return {
        restrict : "AECM",
        template : "<h1>自定义指令!</h1>"
    };
});
