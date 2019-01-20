package com.xu.axis.dao;

import com.xu.axis.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

  /**
   * . 输入用户名获得用户信息
   *
   * @return 密码
   */
  User getUserByName(String userName);

  /**
   * . 输入用户ID获得用户信息
   *
   * @return 密码
   */
  User getUserByID(String userID);

  /**
   * . 新建用户
   */
  void insertUser(User user);

  /**
   * . 更新用户
   */
  void updateUser(User user);
}
