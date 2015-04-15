var _ = require('underscore');

var blogsModule = require('./blogs/blogsModule');

var app = angular.module('app', ['ng', 'ngTouch', 'ui.router',
	blogsModule.$name
]);

app.config(function($stateProvider, $urlRouterProvider) {
	// For any unmatched url, redirect to /
	$urlRouterProvider.otherwise('/');

	// Set up the states
	$stateProvider.state('blogs', _.extend({}, blogsModule.routeInfo, {
		url: '/blogs'
	}));
});
