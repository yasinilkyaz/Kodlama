package eCommerceRegisterAndLogin.dataAccess.abstracts;

import eCommerceRegisterAndLogin.entities.concretes.User;

public interface UserDao {
    void add(User user);
    void delete(User user);
    boolean login(String email,String password);
    boolean emailCheck(String email);
    void showUsers();
}
