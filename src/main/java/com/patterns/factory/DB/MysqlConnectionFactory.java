package com.patterns.factory.DB;

public class MysqlConnectionFactory extends DBConnectionFactory{
    @Override
    DBConnections createConnection() {
        System.out.println("MySql Connection is established");
        return MySqlDBConnection.getInstance();
    }
}
