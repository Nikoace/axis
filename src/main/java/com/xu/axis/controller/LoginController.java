package com.xu.axis.controller;

import com.xu.axis.service.LoginService;
import com.xu.axis.service.UserService;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

  private static final String LOGIN_ERROR = "用户名或密码错误";

  @Autowired
  protected UserService userService;


  @Resource
  private LoginService loginService;

  @RequestMapping(value = "/readyLogin.do", method = RequestMethod.GET)
  public String index(HttpSession session) {

    session.removeAttribute("username");

    session.removeAttribute("password");

    session.removeAttribute("type");

    session.removeAttribute("error");

    return "login/login";
  }

  @RequestMapping(value = "/logOut.do", method = RequestMethod.GET)
  public String logOut(HttpSession session) {
    session.removeAttribute("username");

    session.removeAttribute("password");

    session.removeAttribute("type");

    session.removeAttribute("error");

    return "login/logOut";
  }

  @RequestMapping(value = "login.do", method = RequestMethod.POST)
  public void login(@RequestParam String userName, @RequestParam String password,
      HttpSession session) {
    if (loginService.loginValidate(userName, password)) {
      session.setAttribute("username", userName);
      session.setAttribute("type", userService.getUserByName(userName).getUserType());
    } else {
      session.setAttribute("error", LOGIN_ERROR);
    }
  }


}
