package com.xyz.shows.management.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.xyz.shows.management.model.Cinema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateCinemaRequest
 */
@Validated
public class CreateCinemaRequest   {
  @JsonProperty("cinema")
  private Cinema cinema = null;

  public CreateCinemaRequest cinema(Cinema cinema) {
    this.cinema = cinema;
    return this;
  }

  /**
   * Get cinema
   * @return cinema
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Cinema getCinema() {
    return cinema;
  }

  public void setCinema(Cinema cinema) {
    this.cinema = cinema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCinemaRequest createCinemaRequest = (CreateCinemaRequest) o;
    return Objects.equals(this.cinema, createCinemaRequest.cinema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cinema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCinemaRequest {\n");
    
    sb.append("    cinema: ").append(toIndentedString(cinema)).append("\n");
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
