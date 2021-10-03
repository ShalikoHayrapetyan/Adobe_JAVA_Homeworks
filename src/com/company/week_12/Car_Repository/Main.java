package com.company.week_12.Car_Repository;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Random;
import java.util.UUID;

public class Main {
    public static final String JDBC_URL = "jdbc:postgresql://localhost:5434/aca";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "postgres";

    public static void main(String[] args) throws SQLException {


        JDBCPersonRopsitory jdbcPersonRopsitory = new JDBCPersonRopsitory(getPgDatasource());
//         Person person = new Person("name111", "surname1111", "AN226265");
//        jdbcPersonRopsitory.create(person);
//        System.out.println(jdbcPersonRopsitory.getById(2));

        JDBCDocumentRepository jdbcDocumentRepository = new JDBCDocumentRepository(getPgDatasource());
//        Document documnet1 = new Document(5, "aF6616161");
//        jdbcDocumentRepository.create(documnet1);
//        System.out.println(jdbcDocumentRepository.getById(2));

        JDBCCarRepository jdbcCarRepository = new JDBCCarRepository(getPgDatasource());
//        Car car = new Car(5, "mark5", "model5");
//        jdbcCarRepository.create(car);
//        System.out.println(jdbcCarRepository.getById(2));
//        jdbcCarRepository.getAllInfo(2);


        for (int i = 1; i <= 100; i++) {
            jdbcPersonRopsitory.create(new Person("name" + i, "surname" + i, UUID.randomUUID().toString()));
        }
        for (int i = 1; i <= 100; i++) {
            jdbcDocumentRepository.create(new Document(new Random().nextInt(100), UUID.randomUUID().toString()));
        }
        for (int i = 1; i <= 100; i++) {
            jdbcCarRepository.create(new Car(new Random().nextInt(100), "mark" + i, "model" + i));
        }
        jdbcCarRepository.getAllInfo(54);
        jdbcCarRepository.getAllInfo(60);
        jdbcCarRepository.getAllInfo(92);

    }

    public static DataSource getPgDatasource() {

        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setURL(JDBC_URL);
        dataSource.setUser(USERNAME);
        dataSource.setPassword(PASSWORD);
        return dataSource;
    }
}
