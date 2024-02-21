public class DatabaseConnectionManager {
    // Private static instance variable
    private static DatabaseConnectionManager instance;
    private String ID;

    // Private constructor to prevent external instantiation
    private DatabaseConnectionManager(String ID) {
        this.ID = ID;
    }

    // Public method to get the single instance of the class
    public static DatabaseConnectionManager getInstance(String ID) {
        if (instance == null) {
            instance = new DatabaseConnectionManager(ID);
        }
        return instance;
    }

    // Getter for ID
    public String getID() {
        return ID;
    }

    //other Database operation methods
    public void retrieveRegID() {
        // Implementation for retrieving registration ID
    }
}