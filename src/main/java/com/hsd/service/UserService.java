package com.hsd.service;

import com.hsd.dao.UserDao;
import com.hsd.entity.User;

import java.sql.SQLException;
import java.util.List;

public class UserService {
    public List<User> findall(){
        UserDao dao = new UserDao();
        try {
           return dao.selectAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
