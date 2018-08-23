package com.hsd.dao;

import com.hsd.entity.User;
import com.hsd.util.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDao {
    public List<User> selectAll() throws SQLException {
        String sql ="select u_id id,u_name name,u_acc acc,u_pass pass from t_user";
        QueryRunner runner = new QueryRunner(C3P0Util.getDataSource());
      return   runner.query(sql,new BeanListHandler<>(User.class));
    }
}
