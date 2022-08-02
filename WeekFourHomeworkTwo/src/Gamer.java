import java.util.Date;

public class Gamer {

    private int id;
    private String tcNo;
    private String firstName;
    private String lastName;
    private Date birthYear;
    private Game game;

    public Gamer(){

    }




    public Gamer(int id,String tcNo, String firstName, String lastName, Date birthYear,Game game) {
        this.id=id;
        this.tcNo = tcNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.game = game;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Date birthYear) {
        this.birthYear = birthYear;
    }
    public void setGame(Game game) {
        this.game = game;
    }
    public Game getGame() {
        return game;
    }

}
