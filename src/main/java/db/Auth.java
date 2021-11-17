package db;

public class Auth {
    public boolean authorize(Database db) {
        db.getUserData();
        return true;
    }
}
