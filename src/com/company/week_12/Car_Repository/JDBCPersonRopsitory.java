package com.company.week_12.Car_Repository;

import javax.sql.DataSource;
import java.sql.*;

public class JDBCPersonRopsitory implements PersonRepository {
    private final DataSource dataSource;

    public JDBCPersonRopsitory(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void create(Person person) {

        Statement statement = null;
        Connection connection = null;

        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            statement.execute("insert into person (name, surname, passport_number) values" +
                    " ('" + person.getName() + "','"
                    + person.getSurname() + "','"
                    + person.getPassport_number() + "');");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException throwable) {
                throwable.printStackTrace();
            }
        }
    }

    @Override
    public Person getById(long id) throws SQLException {

        Statement statement = null;
        Connection connection = null;

        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();

            ResultSet resultSet=statement.executeQuery("select * from person where id=" + id + ";");
            resultSet.next();
            String name=resultSet.getString("name");
            String surname=resultSet.getString("surname");
            String passport=resultSet.getString("passport_number");

            return new Person(name,surname,passport);



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException throwable) {
                throwable.printStackTrace();
            }
        }

        return null;
    }
}
