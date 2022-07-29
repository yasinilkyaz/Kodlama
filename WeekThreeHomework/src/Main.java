public class Main {

    public static void main(String[] args) {


        UserManager userManager=new UserManager(new Student());
        userManager.add();
        UserManager userManager2=new UserManager(new Instructor());
        userManager2.update();
    }
}
