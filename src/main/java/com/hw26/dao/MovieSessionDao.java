package com.hw26.dao;

import com.hw26.model.MovieSession;

import java.util.List;

public interface MovieSessionDao {
    MovieSession add(MovieSession movieSession);

    List<MovieSession> getAll();
}
