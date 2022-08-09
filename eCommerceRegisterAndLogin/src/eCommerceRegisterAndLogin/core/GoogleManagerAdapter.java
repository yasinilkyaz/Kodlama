package eCommerceRegisterAndLogin.core;

import eCommerceRegisterAndLogin.googleEntry.Google;

public class GoogleManagerAdapter implements GoogleService{


    @Override
    public void gLogin(String message) {
        Google google = new Google();
        google.googleEntry(message);
    }
}
