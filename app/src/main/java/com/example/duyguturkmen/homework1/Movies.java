package com.example.duyguturkmen.homework1;

import com.google.gson.annotations.SerializedName;


    import java.util.List;


    public class Movies {

        @SerializedName("movies")
        private List<Movie> movies;

        public List<Movie> getMovies() {
            return movies;
        }

        public void setMovies(List<Movie> movies) {
            this.movies = movies;
        }
}
