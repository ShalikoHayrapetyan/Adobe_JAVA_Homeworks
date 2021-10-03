package com.company.week_12.Car_Repository;

import java.sql.SQLException;

public interface CarRopsitory {
    void create(Car car) throws SQLException;
    Car getById(long id) throws SQLException;
    void getAllInfo(long carId) throws SQLException;
}
