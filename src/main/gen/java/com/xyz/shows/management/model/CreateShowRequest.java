package com.xyz.shows.management.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateShowRequest
 */
@Validated
public class CreateShowRequest   {
  @JsonProperty("showPrice")
  private String showPrice = null;

  @JsonProperty("showTime")
  private String showTime = null;

  public CreateShowRequest showPrice(String showPrice) {
    this.showPrice = showPrice;
    return this;
  }

  /**
   * Get showPrice
   * @return showPrice
  **/
  @ApiModelProperty(example = "175", required = true, value = "")
      @NotNull

    public String getShowPrice() {
    return showPrice;
  }

  public void setShowPrice(String showPrice) {
    this.showPrice = showPrice;
  }

  public CreateShowRequest showTime(String showTime) {
    this.showTime = showTime;
    return this;
  }

  /**
   * Get showTime
   * @return showTime
  **/
  @ApiModelProperty(example = "2021-09-17 08:45:00", required = true, value = "")
      @NotNull

    public String getShowTime() {
    return showTime;
  }

  public void setShowTime(String showTime) {
    this.showTime = showTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShowRequest createShowRequest = (CreateShowRequest) o;
    return Objects.equals(this.showPrice, createShowRequest.showPrice) &&
        Objects.equals(this.showTime, createShowRequest.showTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showPrice, showTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShowRequest {\n");
    
    sb.append("    showPrice: ").append(toIndentedString(showPrice)).append("\n");
    sb.append("    showTime: ").append(toIndentedString(showTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
