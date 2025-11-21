package com.patterns.factory.DB;

public class MySqlDBConnection implements DBConnections{

    private static MySqlDBConnection instance;
    private MySqlDBConnection() {}

    public static MySqlDBConnection getInstance() {
        synchronized (MySqlDBConnection.class) {
            if (instance == null){
                instance =  new MySqlDBConnection();
            }
        }
        return instance;
    }

    @Override
    public String executeQuery(String dbName) {
        return dbName+"Connection success";
    }
}
