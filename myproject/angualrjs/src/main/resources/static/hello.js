angular.module('demo', [])
    .controller('Hello', function($scope, $http) {
        $http.get('http://rest-service.guides.spring.io/greeting').
        then(function(response) {
            $scope.greeting = response.data;
        });
    });/**
 * Created by chengjiapeng on 2017/3/27.
 */
