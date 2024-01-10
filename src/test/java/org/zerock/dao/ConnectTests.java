package org.zerock.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectTests {

    @Test
    public void testConnection() throws Exception{
        //JDBC드라이버 클래스 메모리 로딩
        Class.forName("org.mariadb.jdbc.Driver");

        //커넥션 설정
        Connection connection = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3308/webdb",
                "webuser",
                "webuser"
        );

        //커넥션이 정상적이면 notnull 커넥션이 이루어 지지 않았다면 null
        Assertions.assertNotNull(connection);
        //Connection 종료
        connection.close();
    }
}
