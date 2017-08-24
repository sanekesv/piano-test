package ru.piano.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ermolaev on 24.08.2017.
 */
public class Owner {

  private Integer reputation;
  @JsonProperty(value = "user_id")
  private Long userId;
  @JsonProperty(value = "user_type")
  private String userType;
  @JsonProperty(value = "accept_rate")
  private Integer acceptRate;
  @JsonProperty(value = "profile_image")
  private String profileImage;
  @JsonProperty(value = "display_name")
  private String displayName;
  private String link;

  public Integer getReputation() {
    return reputation;
  }

  public void setReputation(Integer reputation) {
    this.reputation = reputation;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }

  public Integer getAcceptRate() {
    return acceptRate;
  }

  public void setAcceptRate(Integer acceptRate) {
    this.acceptRate = acceptRate;
  }

  public String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }
}
