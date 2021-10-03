package com.company.week_12.Car_Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDocumentRepository implements DocumentRepository {
    private final DataSource dataSource;

    public JDBCDocumentRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void create(Document document) throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        statement.execute("insert into document (person_id,document_number) values " +
                "('" + document.getPersonId() + "','" + document.getDocumentNumber() + "');");

        statement.close();
        connection.close();
    }

    @Override
    public Document getById(long id) throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from document where id=" + id + ";");
        resultSet.next();

        Long personId = resultSet.getLong("person_id");
        String documentNumber = resultSet.getString("document_number");

        return new Document(personId, documentNumber);
    }
}
