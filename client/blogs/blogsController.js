module.exports = function($scope) {
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
