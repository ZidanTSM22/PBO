class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        // Private constructor to prevent instantiation
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to the database.");
    }
}

// Main
public class SingletonPattern {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.connect();

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println(db1 == db2); // Will print true, proving only one instance exists
    }
}
