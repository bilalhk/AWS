window.app = window.app || {};
window.app.blogs = window.app.blogs || {};

(function(app) {

	app.blogs.blogsController = function($scope) {
		$scope.blogs = [
			{
				title: 'sample post a',
				content: '<insert lorem ipsum>'
			}
		];

		$scope.onBlogClick = function() {
			//TODO: view for single blog post?
		};
	};

}(window.app));