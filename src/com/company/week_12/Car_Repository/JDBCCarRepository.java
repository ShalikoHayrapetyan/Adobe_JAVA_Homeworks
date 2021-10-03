package com.company.week_12.Car_Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class JDBCCarRepository implements CarRopsitory {
    private final DataSource dataSource;

    public JDBCCarRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void create(Car car) throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        statement.execute("insert into car (mark_name,model_name,document_id) values " +
                "('" + car.getMarkName() + "'," +
                "'" + car.getModelName() + "'," +
                "'" + car.getDocumentId() + "');");
        statement.close();
        connection.close();
    }

    @Override
    public Car getById(long id) throws SQLException {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from car where id=" + id + ";");
        resultSet.next();

        Long documentId = resultSet.getLong("document_id");
        String markName = resultSet.getString("mark_name");
        String modelName = resultSet.getString("model_name");

        return new Car(documentId, markName, modelName);
    }

    @Override
    public void getAllInfo(long carId) throws SQLException {

        Car car=this.getById(carId);
        Document document= new JDBCDocumentRepository(dataSource).getById(car.getDocumentId());
        Person person =new  JDBCPersonRopsitory(dataSource).getById(document.getPersonId());

        System.out.println(car+ "\n"+document+"\n"+person);
    }

    public HashMap howMatchCarsHas() throws SQLException {

        HashMap<String, Integer> map = new HashMap<>();
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from car c inner join document d on c.document_id=d.id inner join person p on d.person_id=p.id;");

        System.out.println(resultSet);
//        while (list){
//            if (map.containsKey(resultSet.getString("name"))){
//                System.out.println( map.get(resultSet.getString("name")));
//                resultSet.next();
//
//            }
//            resultSet.next();
//        }

        return null;
    }
}
