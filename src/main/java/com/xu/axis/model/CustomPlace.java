package com.xu.axis.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("customPlace")
public class CustomPlace {

  /**.
   * 场所ID
   */
  private String placeId;
  /**.
   * 场所名
   */
  private String placeName;
}
