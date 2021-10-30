package com.xyz.shows.management.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.xyz.shows.management.model.Theater;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateTheaterRequest
 */
@Validated
public class CreateTheaterRequest   {
  @JsonProperty("theater")
  private Theater theater = null;

  public CreateTheaterRequest theater(Theater theater) {
    this.theater = theater;
    return this;
  }

  /**
   * Get theater
   * @return theater
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Theater getTheater() {
    return theater;
  }

  public void setTheater(Theater theater) {
    this.theater = theater;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTheaterRequest createTheaterRequest = (CreateTheaterRequest) o;
    return Objects.equals(this.theater, createTheaterRequest.theater);
  }

  @Override
  public int hashCode() {
    return Objects.hash(theater);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTheaterRequest {\n");
    
    sb.append("    theater: ").append(toIndentedString(theater)).append("\n");
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
