package com.hw26.service;

import com.hw26.model.Movie;

import java.util.List;

public interface MovieService {
    Movie add(Movie movie);

    List<Movie> getAll();
}
