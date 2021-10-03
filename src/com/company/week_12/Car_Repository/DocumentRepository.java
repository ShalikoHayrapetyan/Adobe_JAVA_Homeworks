package com.company.week_12.Car_Repository;

import java.sql.SQLException;

public interface DocumentRepository {
    void create(Document document) throws SQLException;
    Document getById(long id) throws SQLException;
}
