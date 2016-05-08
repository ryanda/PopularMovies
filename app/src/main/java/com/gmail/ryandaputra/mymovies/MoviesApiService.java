package com.gmail.ryandaputra.mymovies;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by ryandptr on 5/8/2016.
 */
public interface MoviesApiService {
    @GET("/movie/popular")
    void getPopularMovies(Callback<Movie.MovieResult> cb);
}
