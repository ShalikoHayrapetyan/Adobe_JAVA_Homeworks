package com.company.week_11.User_repository;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class JDBCUserRepository implements UserRepository {
    private final String url;
    private final String username;
    private final String password;


    public JDBCUserRepository(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    public void save(User user) {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            statement.execute("insert into users (name, age) values ('" + user.getName() + "', " + user.getAge() + ")");
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void deleteAll() {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            statement.execute("delete from users");
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }
}
