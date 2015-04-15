module.exports = function($http) {
    return {
        browse: function() {
            return $http.get('blogs');
        },
        create: function(blog) {
            return $http.post('blogs', blog);
        }
    }
};