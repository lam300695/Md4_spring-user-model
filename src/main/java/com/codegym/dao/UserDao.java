package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User>users = new ArrayList<>();
    static {
        User u1 = new User("lam","123456","Lam","lam300695@gmail.com",25);
        users.add(u1);

        User u2 = new User("hieu","123456","Hieu","hieu191196@gmail.com",24);
        users.add(u2);

        User u3 = new User("hung","123456","Hung","hung080206@gmail.com",13);
        users.add(u3);
    }

    public static User checkLogin(Login login){
        for (User u: users) {
            if(u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
