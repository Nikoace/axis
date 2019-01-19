package com.xu.axis.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("customType")
public class CustomType {

  /**.
   * 类型ID
   */
  private String typeId;
  /**.
   * 类型名
   */
  private String typeName;
}
