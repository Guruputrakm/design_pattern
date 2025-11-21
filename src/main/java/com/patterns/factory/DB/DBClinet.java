package com.patterns.factory.DB;

public class DBClinet {
    public static void main(String[] args) {
        DBConnectionFactory factory = new MysqlConnectionFactory();
        String s = factory.fireQuery("Select * from DB");
        System.out.println("Result is "+s);
    }
}
