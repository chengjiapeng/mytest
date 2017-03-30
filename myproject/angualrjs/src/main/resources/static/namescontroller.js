/**
 * Created by chengjiapeng on 2017/3/28.
 */
angular.module('myApp', []).controller('namesCtrl', function ($scope) {
    $scope.names=[
        {name:'JaNi', country:'NorWay'},
        {name:'Hege', country:'Sweden'},
        {name:'Kai', country:'Denmark'}
    ];
});