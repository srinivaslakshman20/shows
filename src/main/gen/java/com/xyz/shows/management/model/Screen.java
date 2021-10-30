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
 * Screen
 */
@Validated
public class Screen   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("seatCapacity")
  private Long seatCapacity = null;

  public Screen name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Screen_1", value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Screen seatCapacity(Long seatCapacity) {
    this.seatCapacity = seatCapacity;
    return this;
  }

  /**
   * Get seatCapacity
   * @return seatCapacity
  **/
  @ApiModelProperty(example = "200", value = "")
  
    public Long getSeatCapacity() {
    return seatCapacity;
  }

  public void setSeatCapacity(Long seatCapacity) {
    this.seatCapacity = seatCapacity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Screen screen = (Screen) o;
    return Objects.equals(this.name, screen.name) &&
        Objects.equals(this.seatCapacity, screen.seatCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, seatCapacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Screen {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seatCapacity: ").append(toIndentedString(seatCapacity)).append("\n");
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
