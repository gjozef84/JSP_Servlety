package com.myTwitter.services;

/**
 * Created by Grzesiek on 2018-10-07
 */
public class LoginServiceImpl implements LoginService {

    @Override
    public boolean login(String login, String password) {
        if ("admin".equals(login) && "admin".equals(password)) {
            return true;
        }
        if ("user".equals(login) && "user".equals(password)) {
            return true;
        }
        return false;
    }
}
