package com.company.week_11.User_repository;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("user1", 20);
        JDBCUserRepository jdbcUserRepository = new JDBCUserRepository(
                "jdbc:postgresql://localhost:5454/aca",
                "postgres",
                "password"
        );

        jdbcUserRepository.save(user1);
        jdbcUserRepository.deleteAll();
    }
}
