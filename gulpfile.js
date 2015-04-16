'use strict';

var gulp = require('gulp');
var browserify = require('browserify');
var source = require('vinyl-source-stream');
var buffer = require('vinyl-buffer');
var gutil = require('gulp-util');
var sourcemaps = require('gulp-sourcemaps');
var rename = require('gulp-rename');
var del = require('del');

gulp.task('clean', function(callback) {
    del([ 'public/**' ], callback);
});

gulp.task('javascript', ['clean'], function() {
    // set up the browserify instance on a task basis
    browserify({ entries: './client/main.js', debug: true })
        .bundle()
        .pipe(source('./client/main.js'))
        .pipe(buffer())
        .pipe(rename({ dirname: '' }))
        .pipe(sourcemaps.init({loadMaps: true}))
        .pipe(sourcemaps.write('./'))
        .on('error', gutil.log)
        .pipe(gulp.dest('./public'));
});

gulp.task('html', ['clean'], function() {
    gulp.src('**/*.html', { base: './client' })
        .pipe(gulp.dest('./public'));
});

gulp.task('css', ['clean'], function() {
    gulp.src('**/*.css', { base: './client' })
        .pipe(gulp.dest('./public'));
});

gulp.task('default', ['javascript', 'html', 'css']);
