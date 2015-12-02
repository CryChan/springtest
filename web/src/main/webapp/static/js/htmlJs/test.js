/**
 * Created by Administrator on 2015/12/1.
 */
'use strict';

/* App Module */
var modelApp = angular.module('modelApp', []);

modelApp.config(function($interpolateProvider) {
    $interpolateProvider.startSymbol('[[');
    $interpolateProvider.endSymbol(']]');
});

/* 自定义过滤器 */
modelApp.filter('myfilter', function() {
    return function(input) {
        if(input.indexOf("--")>0){
            input=input.replace("--","~");
        }
        return input;
    }

});

function modelListCtrl ($scope, $http) {

    $scope.show=function(){
        testService.get({},function(data){
            $scope.fruit = data;
        });
        //$scope.fruits = list;
        bool = !bool;
    }

    $scope.showjson=function(){
        //testServices.get('/test/returnjson/?format=json',{},function(){
        //    $scope.fruit = list;
        //});
        return bool;
    }

    function init() {
        testService = new TestServices($http);
        list = [{name:"apple",price:"12",country:"China"},
                    {name:"banana",price:"14",country:"Afrian"},
                    {name:"watermelon",price:"16",country:"Japan"}];
    }

    var bool = false;
    var list = [];
    var testService;
    init();



}