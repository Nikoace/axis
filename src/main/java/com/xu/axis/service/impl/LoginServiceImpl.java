package com.xu.axis.service.impl;

import com.xu.axis.dao.UserDao;
import com.xu.axis.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

  @Autowired
  private UserDao userDao;

  @Override
  public boolean loginValidate(String userName, String password) {
    try {
      String UserPassword = userDao.getUserByName(userName).getPassword();
      return UserPassword.equals(password);
    } catch (Exception e) {
      return false;
    }
  }
}
