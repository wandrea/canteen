angular.module('canteenApp')

    .factory('productrepService', function ($http) {
        var svc = {};
        var apiUrl = "http://localhost:8080/canteen";

        svc.getAllProductReport = function () {
            return $http.post(apiUrl + '/productreport');
        }


        return svc;
    });