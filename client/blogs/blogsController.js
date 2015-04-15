module.exports = function($scope, blogsRepository) {
	blogsRepository.browse()
		.success(function(httpResult) {
			$scope.blogs = httpResult;
		});

	$scope.onBlogClick = function() {
		//TODO: view for single blog post?
	};

	$scope.onAddBlogClick = function() {
		blogsRepository.create($scope.newBlog)
			.then(function() { delete $scope.newBlog});
	}
};
