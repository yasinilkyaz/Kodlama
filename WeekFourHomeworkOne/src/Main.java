import java.util.Date;

public class Main {
    public static void main(String[] args) {

        BaseCustomerManager customerManager=new NeroCustomerManager();
        customerManager.save(new Customer(1,"Yasin","ilkyaz","12094056658",new Date(1995)));
    }
}