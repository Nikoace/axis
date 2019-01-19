package com.xu.axis.model;

import java.util.Date;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("result")
public class Result {

  /**.
   * 结果ID
   */
  private String resultId;
  /**.
   * 结果(JSON)
   */
  private String result;
  /**.
   * 生成结果日期
   */
  private Date resultTime;
  /**.
   * 生成结果用户
   */
  private String resultUser;
}
