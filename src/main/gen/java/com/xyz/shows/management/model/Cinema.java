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
 * Cinema
 */
@Validated
public class Cinema   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("castMembers")
  private String castMembers = null;

  @JsonProperty("languages")
  private String languages = null;

  @JsonProperty("genre")
  private String genre = null;

  @JsonProperty("durationInMins")
  private Long durationInMins = null;

  public Cinema id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "345", value = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Cinema name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Fast and Furious 6", required = true, value = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Cinema description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Hobbs is tasked with catching a team of mercenary drivers who manage to evade him every time.", required = true, value = "")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Cinema castMembers(String castMembers) {
    this.castMembers = castMembers;
    return this;
  }

  /**
   * Get castMembers
   * @return castMembers
  **/
  @ApiModelProperty(example = "Paul Walker, Vin Diesel, Michelle Rodriguez", required = true, value = "")
      @NotNull

    public String getCastMembers() {
    return castMembers;
  }

  public void setCastMembers(String castMembers) {
    this.castMembers = castMembers;
  }

  public Cinema languages(String languages) {
    this.languages = languages;
    return this;
  }

  /**
   * Get languages
   * @return languages
  **/
  @ApiModelProperty(example = "English, Hindi", required = true, value = "")
      @NotNull

    public String getLanguages() {
    return languages;
  }

  public void setLanguages(String languages) {
    this.languages = languages;
  }

  public Cinema genre(String genre) {
    this.genre = genre;
    return this;
  }

  /**
   * Get genre
   * @return genre
  **/
  @ApiModelProperty(example = "Action", required = true, value = "")
      @NotNull

    public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public Cinema durationInMins(Long durationInMins) {
    this.durationInMins = durationInMins;
    return this;
  }

  /**
   * Get durationInMins
   * @return durationInMins
  **/
  @ApiModelProperty(example = "112", required = true, value = "")
      @NotNull

    public Long getDurationInMins() {
    return durationInMins;
  }

  public void setDurationInMins(Long durationInMins) {
    this.durationInMins = durationInMins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cinema cinema = (Cinema) o;
    return Objects.equals(this.id, cinema.id) &&
        Objects.equals(this.name, cinema.name) &&
        Objects.equals(this.description, cinema.description) &&
        Objects.equals(this.castMembers, cinema.castMembers) &&
        Objects.equals(this.languages, cinema.languages) &&
        Objects.equals(this.genre, cinema.genre) &&
        Objects.equals(this.durationInMins, cinema.durationInMins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, castMembers, languages, genre, durationInMins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cinema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    castMembers: ").append(toIndentedString(castMembers)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
    sb.append("    durationInMins: ").append(toIndentedString(durationInMins)).append("\n");
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
