var blogsRepository = require('./blogsRepository');
var blogsController = require('./blogsController');

var blogsModule = {
    $name: 'blogs',
    routeInfo: {
        controller: blogsController,
        templateUrl: 'blogs/blogs.html'
    }
};

angular.module(blogsModule.$name, [])
    .factory('blogsRepository', blogsRepository);

module.exports = blogsModule;