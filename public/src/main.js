var app = angular.module('app', ['ng', 'ui.router']);

app.config(function($stateProvider, $urlRouterProvider) {
  //
  // For any unmatched url, redirect to /
  $urlRouterProvider.otherwise("/");
  //
  // Now set up the states
  $stateProvider
    .state('a', {
      url: "/a",
      templateUrl: "src/app/a/a.html"
    })
    .state('b', {
      url: "/b",
      templateUrl: "src/app/b/b.html"
    })
    .state('c', {
      url: "/c",
      templateUrl: "src/app/c/c.html"
    })
});