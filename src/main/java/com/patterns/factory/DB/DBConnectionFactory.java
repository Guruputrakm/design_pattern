package com.patterns.factory.DB;

public abstract class DBConnectionFactory {

    abstract DBConnections createConnection();

    public String fireQuery(String sql) {
        DBConnections connection = createConnection();
        return connection.executeQuery(sql);
    }

}
