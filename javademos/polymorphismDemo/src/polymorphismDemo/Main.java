package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
		BaseLogger[] baseLoggers=new BaseLogger[] {new EmailLogger(),new FileLogger(),new DatabaseLogger(),new ConsoleLogger()};
		for (BaseLogger logger : baseLoggers) {
			logger.log("log mesajı");
		}
		
		
		
		CustomerManager customerManager=new CustomerManager(new FileLogger());
		customerManager.add();
		
	}

}
