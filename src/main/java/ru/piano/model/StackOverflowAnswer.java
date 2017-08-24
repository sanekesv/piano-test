package ru.piano.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ermolaev on 24.08.2017.
 */
public class StackOverflowAnswer {
  private List<Item> items;
  @JsonProperty(value = "has_more")
  private Boolean hasMore;
  @JsonProperty(value = "quota_max")
  private Integer quotaMax;
  @JsonProperty(value = "quota_remaining")
  private Integer quotaRemaining;

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public Integer getQuotaMax() {
    return quotaMax;
  }

  public void setQuotaMax(Integer quotaMax) {
    this.quotaMax = quotaMax;
  }

  public Integer getQuotaRemaining() {
    return quotaRemaining;
  }

  public void setQuotaRemaining(Integer quotaRemaining) {
    this.quotaRemaining = quotaRemaining;
  }
}
