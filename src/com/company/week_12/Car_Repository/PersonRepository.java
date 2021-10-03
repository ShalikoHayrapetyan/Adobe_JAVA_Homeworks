package com.company.week_12.Car_Repository;

import java.sql.SQLException;

public interface PersonRepository {
    void create(Person person) throws SQLException;
    Person getById(long id) throws SQLException;
}
