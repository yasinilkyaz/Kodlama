public class Main {

    public static void main(String[] args) {


        UserManager userManager=new UserManager(new StudentManager());
        userManager.add();
        UserManager userManager2=new UserManager(new InstructorManager());
        userManager2.update();
    }
}
