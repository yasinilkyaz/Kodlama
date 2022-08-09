package eCommerceRegisterAndLogin.logger.concretes;

import eCommerceRegisterAndLogin.logger.abstracts.Logger;
import eCommerceRegisterAndLogin.entities.concretes.User;

public class MailLogger implements Logger {
    @Override
    public void log(User user) {
        System.out.println("Email loglandı  "+user.getEmailAdress());
    }
}
