package eCommerceRegisterAndLogin.business.concretes;

import eCommerceRegisterAndLogin.dataAccess.abstracts.UserDao;
import eCommerceRegisterAndLogin.dataAccess.concretes.HibernateUserDao;
import eCommerceRegisterAndLogin.entities.concretes.User;
import java.util.regex.*;
public class RegistrationConditions {

    public boolean passwordCheck(User user){
        int letterCount=user.getPassword().length();
        if(letterCount>=6){

            return true;
        }else{
            System.out.println("Geçersiz şifre");
            return false;
        }

    }

    public boolean emailFormat(User user){
        //regex ile kontrol sonrası true veya false
        String mail=user.getEmailAdress();
        boolean et= Pattern.matches(".*@.*",mail);

        boolean dotCom=Pattern.matches(".*.com",mail);


        if (et&&dotCom){

            return true;
        }
        else {
            System.out.println("email koşulu sağlanmadı");
            return false;

        }

    }
    public boolean sortEmail(User user){
        String email=user.getEmailAdress();
        UserDao userDao=new HibernateUserDao();

        return userDao.emailCheck(email);
    }
    public boolean checkNames(User user){
        //adı ve soyadı en az 2 harf olacak
        int letterCountOfFirstName=user.getFirstName().length();
        int letterCountOfLastName=user.getLastName().length();


        if(letterCountOfFirstName>2&&letterCountOfLastName>2){

            return true;
        }else{
            System.out.println("Geçersiz ad-soyad");
            return false;
        }
    }

}
