package studentinfodb;

public class DatabaseLicense {

    private DatabaseLicense() {
//		new DatabaseLicense();
    }

    public static DatabaseLicense getInstance() {
        DatabaseLicense dbLicense = new DatabaseLicense();
        return new DatabaseLicense();

    }

    public void databaseFeatures() {
        System.out.println("We have SQL Database features");

    }

}
