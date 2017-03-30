/**
 * Created by chengjiapeng on 2017/3/29.
 */
angular.module('myForm', [])
        .controller('customersCtrl', function ($scope, $http) {
            $http.get("/userList").then(function (response) {
                $scope.names = response.data;
            })
        })