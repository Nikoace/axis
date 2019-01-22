package com.xu.axis.controller;


import com.xu.axis.pojo.VueLoginInfo;
import com.xu.axis.result.Result;
import com.xu.axis.result.ResultFactory;
import com.xu.axis.service.UserService;
import java.util.Objects;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {

  @Autowired
  private UserService userService;

  @CrossOrigin
  @RequestMapping(value = "/login", method = RequestMethod.POST,
      produces = "application/json ; charset=UTF-8")
  @ResponseBody
  public Result login(@Valid @RequestBody VueLoginInfo loginInfo, BindingResult bind) {
    if (null == userService.getUserByName(loginInfo.getUsername())) {
      String message = "登陆失败";

      return ResultFactory.buildFailResult(message);
    } else {
      String username = userService.getUserByName(loginInfo.getUsername()).getUserName();
      String password = userService.getUserByName(loginInfo.getUsername()).getPassword();

      if (bind.hasErrors()) {
        String message = String.format("登陆失败，[%s]", bind.getFieldError().getDefaultMessage());
        return ResultFactory.buildFailResult(message);
      }
      if (!Objects.equals(username, loginInfo.getUsername()) && Objects
          .equals(password, loginInfo.getPassword())) {
        return ResultFactory.buildSuccessResult("成功");
      }
      String message = "登陆失败，详细信息[用户名、密码信息不正确]。";
      return ResultFactory.buildFailResult(message);
    }


  }
}
