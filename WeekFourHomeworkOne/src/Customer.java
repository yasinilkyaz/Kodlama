import java.util.Date;

public class Customer implements Entity {
    int id;
    String firtsName;
    String lastName;
    String nationalityId;
    Date birthYear;

    public Customer(int id, String firtsName, String lastName, String nationalityId,Date birthYear) {
        this.id = id;
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
        this.birthYear=birthYear;
    }
}
