package eCommerceRegisterAndLogin.business.concretes;

import eCommerceRegisterAndLogin.business.abstracts.UserService;
import eCommerceRegisterAndLogin.core.GoogleManagerAdapter;
import eCommerceRegisterAndLogin.core.GoogleService;
import eCommerceRegisterAndLogin.dataAccess.abstracts.UserDao;
import eCommerceRegisterAndLogin.dataAccess.concretes.HibernateUserDao;
import eCommerceRegisterAndLogin.entities.concretes.User;

public class UserManager implements UserService {



    @Override
    public void newUser(User user) {
        RegistrationConditions conditions=new RegistrationConditions();
        boolean checkName=conditions.checkNames(user);
        boolean emailFormat=conditions.emailFormat(user);
        boolean sortEmail=conditions.sortEmail(user);
        boolean passwordCheck=conditions.passwordCheck(user);

        if (checkName && emailFormat && sortEmail && passwordCheck){
            UserDao userDao1=new HibernateUserDao();
            userDao1.add(user);
            System.out.println("Kayıt başarılı");
            return;
        }else {
            System.out.println("Koşullar sağlanmadı, Kayıt işlemi başarısız");
        }

        //regex kısıtlamaları yaz uygunsa daoya gönder ayrıca mail doğrulama kodu gönder değilse hata mesajı ile return
    }
    @Override
    public void login(String email,String password){
    UserDao userDao=new HibernateUserDao();
    userDao.login(email, password);
    }
    public void googleLogin(User user){
    GoogleService googleService=new GoogleManagerAdapter();
        googleService.gLogin("Google ile giriş yapıldı");
    }

    @Override
    public void delete(User user) {
        UserDao userDao=new HibernateUserDao();
        userDao.delete(user);
    }
}
