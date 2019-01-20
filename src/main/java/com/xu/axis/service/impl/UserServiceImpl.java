package com.xu.axis.service.impl;

import com.xu.axis.dao.UserDao;
import com.xu.axis.model.User;
import com.xu.axis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;

  @Override
  public User getUserByName(String username) {
    return userDao.getUserByName(username);
  }

  @Override
  public User getUserinfo(User user) {
    return null;
  }
}
