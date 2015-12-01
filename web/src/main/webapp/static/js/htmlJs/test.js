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
        testServices.get('/test/returnjson/?format=json',{},function(){
            $scope.fruit = list;
        });
    }

    function init() {
        testService = new TestServices();
        list = [{name:"apple",price:"12",country:"China"},
                    {name:"banana",price:"14",country:"Afrian"},
                    {name:"watermelome",price:"16",country:"Japan"}];
    }

    var list = [];
    var testService;
    init();



}