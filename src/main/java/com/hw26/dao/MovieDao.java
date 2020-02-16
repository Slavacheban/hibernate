package com.hw26.dao;

import com.hw26.model.Movie;

import java.util.List;

public interface MovieDao {
    Movie add(Movie movie);

    List<Movie> getAll();
}
