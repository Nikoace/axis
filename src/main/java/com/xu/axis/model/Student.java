package com.xu.axis.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("student")
public class Student {

  /**.
   * 学号
   */
  private String studentId;
  /**.
   * 姓名
   */
  private String studentName;
  /**.
   * 性别
   */
  private String studentGender;
}
