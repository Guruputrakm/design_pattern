package com.patterns.factory.DB;

public class PostgressDBConnection implements DBConnections{


    private static PostgressDBConnection instance;
    private PostgressDBConnection() {}

    public static PostgressDBConnection getInstance() {
        synchronized (PostgressDBConnection.class) {
            if (instance == null){
                instance =  new PostgressDBConnection();
            }
        }
        return instance;
    }


    @Override
    public String executeQuery(String dbName) {
        return "Connected to Postgress DB";
    }
}
