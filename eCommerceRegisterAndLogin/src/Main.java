import eCommerceRegisterAndLogin.business.abstracts.UserService;
import eCommerceRegisterAndLogin.business.concretes.UserManager;
import eCommerceRegisterAndLogin.dataAccess.abstracts.UserDao;
import eCommerceRegisterAndLogin.dataAccess.concretes.HibernateUserDao;
import eCommerceRegisterAndLogin.entities.concretes.User;


public class Main {
    public static void main(String[] args) {
        UserDao userDao=new HibernateUserDao();
        UserService userService=new UserManager();

        User yasin=new User(1,"yasin","ilkyaz","213a45","yasinilkyaz@gmail.com",false);
        //kendimi doğru bir şekilde db ye ekledim
        userService.newUser(yasin);
        System.out.println("---------------------------------------------");
        User ayniEmail=new User(2,"yasin","ilk","654213","yasinilkyaz@gmail.com",false);
        //aynı Mail adresi ile kayıt denemesi
        userService.newUser(ayniEmail);
        System.out.println("---------------------------------------------");

        User hatalıGiris=new User(3,"kı","şifre","12345","sadasdasd",false);
        //kısa ad soyad , hatalı şifre , hatalı emailde kullanıcı eklenmedi

        userService.newUser(hatalıGiris);

        System.out.println("---------------------------------------------");


        //hatalı şifre veya email denemesi
        userService.login("yasinilkyaz@gmail.com","213a456");


        System.out.println("---------------------------------------------");
        //doğru şifre email denemesi
        userService.login("yasinilkyaz@gmail.com","213a45");

        System.out.println("---------------------------------------------");



        //bir tane silme işlevi çalışıyor mu diye ekliyorum
        User delete=new User(4,"silinecek","silinme","denemeee","silin@silin.com",false);

        userService.newUser(delete);

        userDao.showUsers();

        userService.delete(delete);

        userDao.showUsers();

    }
}