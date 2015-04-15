module.exports = function($scope, blogsRepository) {
	$scope.blogs = blogsRepository.browse();

	$scope.onBlogClick = function() {
		//TODO: view for single blog post?
	};

	$scope.onAddBlogClick = function() {
		blogsRepository.create($scope.newBlog)
			.then(function() { delete $scope.newBlog});
	}
};
