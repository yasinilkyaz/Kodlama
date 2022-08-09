package eCommerceRegisterAndLogin.dataAccess.concretes;

import eCommerceRegisterAndLogin.dataAccess.abstracts.UserDao;
import eCommerceRegisterAndLogin.entities.concretes.User;
import eCommerceRegisterAndLogin.logger.abstracts.Logger;
import eCommerceRegisterAndLogin.logger.concretes.MailLogger;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    static List<User> users = new ArrayList<>();

    //bizim databasemiz şimdilik yukardaki list
    @Override
    public void add(User user) {
        users.add(user);
        System.out.println("Hibernate ile kullanıcı eklendi :" + user.getFirstName());
        Logger logger=new MailLogger();
        logger.log(user);

    }

    @Override
    public void delete(User user) {
        users.remove(user);
        System.out.println("Hibernate ile kullanıcı silindi :" + user.getFirstName());
    }

    @Override
    public boolean login(String email, String password) {
        for (User user1 : users) {
            if (email == user1.getEmailAdress() && password == user1.getPassword()) {
                System.out.println("Hoşgeldin  " + user1.getFirstName());

                return true;

            }

        }
        System.out.println("Email veya şifre yanlış");
        return false;
    }

    @Override
    public boolean emailCheck(String email) {
        for (User user1 : users) {

            if (user1.getEmailAdress().equals(email)) {

                System.out.println("Bu mail üzerinde bir hesap zaten var");

                return false;

            }

        }
        return true;
    }

    @Override
    public void showUsers() {
        System.out.println("Kayıtlı kullanıcılar");
        for (User user2 : users) {
            System.out.println("*"+user2.getFirstName());

        }
    }
}
