public class StarBucksCustomerManager extends BaseCustomerManager {
private CustomerCheckService iCustomerService;


public StarBucksCustomerManager(CustomerCheckService customerCheckService){
    this.iCustomerService=customerCheckService;
}

@Override
    public void Save(Customer customer) {
        if(iCustomerService.checkIfRealPerson(customer)){
            save(customer);
        }else {
            System.out.println("Bilgi hatalı");
        }
    }



}
