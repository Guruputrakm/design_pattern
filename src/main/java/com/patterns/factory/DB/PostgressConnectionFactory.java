package com.patterns.factory.DB;

public class PostgressConnectionFactory extends DBConnectionFactory{
    @Override
    DBConnections createConnection() {
        System.out.println("Postgres Connection is established");
        return PostgressDBConnection.getInstance();
    }
}
