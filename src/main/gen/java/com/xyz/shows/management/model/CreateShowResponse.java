package com.xyz.shows.management.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.xyz.shows.management.model.Show;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateShowResponse
 */
@Validated
public class CreateShowResponse   {
  @JsonProperty("show")
  private Show show = null;

  public CreateShowResponse show(Show show) {
    this.show = show;
    return this;
  }

  /**
   * Get show
   * @return show
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Show getShow() {
    return show;
  }

  public void setShow(Show show) {
    this.show = show;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShowResponse createShowResponse = (CreateShowResponse) o;
    return Objects.equals(this.show, createShowResponse.show);
  }

  @Override
  public int hashCode() {
    return Objects.hash(show);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShowResponse {\n");
    
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
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
