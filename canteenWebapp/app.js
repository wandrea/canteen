angular.module('canteenApp', ["ngRoute"]);

angular.module('canteenApp')
    .config(

    function ($routeProvider, $locationProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'home/home.html',
                controller: 'homeController',

            })

            .when('/sale', {
                templateUrl: 'sale/sale.html',
                controller: 'saleController',
            })


            .when('/employee', {
                templateUrl: 'employee/employeerep.html',
                controller: 'employeerepController',
            })
            .when('/product', {
                templateUrl: 'product/productrep.html',
                controller: 'productrepController'
            })
            ;
        $locationProvider.html5Mode(false);
    })