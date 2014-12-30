(function(blogsModule) {

	var app = angular
		.module('app', ['ng', 'ngTouch', 'ui.router'])
		.controller('blogs.controller', blogsModule.blogsController);

	app.config(function($stateProvider, $urlRouterProvider) {
		// For any unmatched url, redirect to /
		$urlRouterProvider.otherwise('/');

		// Set up the states
		$stateProvider.state('blogs', {
			url: '/blogs',
			templateUrl: 'src/app/blogs/blogs.html'
		});
	});

}(window.app.blogs));
