package com.xyz.shows.management.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.xyz.shows.management.model.Cinema;
import com.xyz.shows.management.model.ShowOffer;
import com.xyz.shows.management.model.Theater;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Show
 */
@Validated
public class Show   {
  @JsonProperty("showId")
  private Long showId = null;

  @JsonProperty("cinema")
  private Cinema cinema = null;

  @JsonProperty("theater")
  private Theater theater = null;

  @JsonProperty("showOffers")
  @Valid
  private List<ShowOffer> showOffers = null;

  @JsonProperty("showTotalPrice")
  private Long showTotalPrice = null;

  @JsonProperty("discountedTotalPrice")
  private Long discountedTotalPrice = null;

  @JsonProperty("showTime")
  private String showTime = null;

  public Show showId(Long showId) {
    this.showId = showId;
    return this;
  }

  /**
   * Get showId
   * @return showId
  **/
  @ApiModelProperty(example = "456", value = "")
  
    public Long getShowId() {
    return showId;
  }

  public void setShowId(Long showId) {
    this.showId = showId;
  }

  public Show cinema(Cinema cinema) {
    this.cinema = cinema;
    return this;
  }

  /**
   * Get cinema
   * @return cinema
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Cinema getCinema() {
    return cinema;
  }

  public void setCinema(Cinema cinema) {
    this.cinema = cinema;
  }

  public Show theater(Theater theater) {
    this.theater = theater;
    return this;
  }

  /**
   * Get theater
   * @return theater
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Theater getTheater() {
    return theater;
  }

  public void setTheater(Theater theater) {
    this.theater = theater;
  }

  public Show showOffers(List<ShowOffer> showOffers) {
    this.showOffers = showOffers;
    return this;
  }

  public Show addShowOffersItem(ShowOffer showOffersItem) {
    if (this.showOffers == null) {
      this.showOffers = new ArrayList<>();
    }
    this.showOffers.add(showOffersItem);
    return this;
  }

  /**
   * Get showOffers
   * @return showOffers
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ShowOffer> getShowOffers() {
    return showOffers;
  }

  public void setShowOffers(List<ShowOffer> showOffers) {
    this.showOffers = showOffers;
  }

  public Show showTotalPrice(Long showTotalPrice) {
    this.showTotalPrice = showTotalPrice;
    return this;
  }

  /**
   * Get showTotalPrice
   * @return showTotalPrice
  **/
  @ApiModelProperty(example = "250", value = "")
  
    public Long getShowTotalPrice() {
    return showTotalPrice;
  }

  public void setShowTotalPrice(Long showTotalPrice) {
    this.showTotalPrice = showTotalPrice;
  }

  public Show discountedTotalPrice(Long discountedTotalPrice) {
    this.discountedTotalPrice = discountedTotalPrice;
    return this;
  }

  /**
   * Get discountedTotalPrice
   * @return discountedTotalPrice
  **/
  @ApiModelProperty(example = "225", value = "")
  
    public Long getDiscountedTotalPrice() {
    return discountedTotalPrice;
  }

  public void setDiscountedTotalPrice(Long discountedTotalPrice) {
    this.discountedTotalPrice = discountedTotalPrice;
  }

  public Show showTime(String showTime) {
    this.showTime = showTime;
    return this;
  }

  /**
   * Get showTime
   * @return showTime
  **/
  @ApiModelProperty(example = "2021-09-17 08:45:00.000", value = "")
  
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
    Show show = (Show) o;
    return Objects.equals(this.showId, show.showId) &&
        Objects.equals(this.cinema, show.cinema) &&
        Objects.equals(this.theater, show.theater) &&
        Objects.equals(this.showOffers, show.showOffers) &&
        Objects.equals(this.showTotalPrice, show.showTotalPrice) &&
        Objects.equals(this.discountedTotalPrice, show.discountedTotalPrice) &&
        Objects.equals(this.showTime, show.showTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showId, cinema, theater, showOffers, showTotalPrice, discountedTotalPrice, showTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Show {\n");
    
    sb.append("    showId: ").append(toIndentedString(showId)).append("\n");
    sb.append("    cinema: ").append(toIndentedString(cinema)).append("\n");
    sb.append("    theater: ").append(toIndentedString(theater)).append("\n");
    sb.append("    showOffers: ").append(toIndentedString(showOffers)).append("\n");
    sb.append("    showTotalPrice: ").append(toIndentedString(showTotalPrice)).append("\n");
    sb.append("    discountedTotalPrice: ").append(toIndentedString(discountedTotalPrice)).append("\n");
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
