package eCommerceRegisterAndLogin.logger.abstracts;

import eCommerceRegisterAndLogin.entities.concretes.User;

public interface Logger {
    void log(User user);
}
