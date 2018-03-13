angular.module('canteenApp')

    .factory('employeerepService', function ($http) {
        var svc = {};
        var apiUrl = "http://localhost:8080/canteen";

        svc.getAllEmployeeReport = function () {
            return $http.post(apiUrl + '/employeereport');
        }



        return svc;
    });