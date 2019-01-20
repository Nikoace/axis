package com.xu.axis.service;

import com.xu.axis.model.User;

public interface UserService {

  User getUserinfo(User user);

  User getUserByName(String username);
}
