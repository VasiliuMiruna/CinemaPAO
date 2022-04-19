package service;



public class MySqlConnection implements DBConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to database from mysql!!!");
    }
}
