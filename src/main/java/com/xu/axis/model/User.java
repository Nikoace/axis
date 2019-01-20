package com.xu.axis.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("User")
public class User {

  /**.
   * 用户ID
   */
  private String userId;
  /**.
   * 用户名
   */
  private String userName;
  /**.
   * 用户密码
   */
  private String password;
  /**.
   * 用户类型
   */
  private String userType;
  /**.
   * 更新用户
   */
  private String updateUser;
}
