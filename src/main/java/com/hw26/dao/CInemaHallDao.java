package com.hw26.dao;

import com.hw26.model.CinemaHall;

import java.util.List;

public interface CInemaHallDao {
    CinemaHall add(CinemaHall cinemaHall);

    List<CinemaHall> getAll();
}
