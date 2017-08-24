package ru.piano.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ermolaev on 24.08.2017.
 */
public class Item {

  private List<String> tags;
  private Owner owner;
  @JsonProperty(value = "is_answered")
  private Boolean isAnswered;
  @JsonProperty(value = "view_count")
  private Integer viewCount;
  @JsonProperty(value = "closed_date")
  private Integer closedDate;
  @JsonProperty(value = "protected_date")
  private Integer protectedDate;
  @JsonProperty(value = "accepted_answer_id")
  private Integer acceptedAnswerId;
  @JsonProperty(value = "answer_count")
  private Integer answerCount;
  private Integer score;
  @JsonProperty(value = "last_activity_date")
  private Date lastActivityDate;
  @JsonProperty(value = "creation_date")
  private Date creationDate;
  @JsonProperty(value = "last_edit_date")
  private Date lastEditDate;
  @JsonProperty(value = "question_id")
  private Long questionid;
  private String link;
  @JsonProperty(value = "closed_reason")
  private String closedReason;
  private String title;
  @JsonProperty(value = "migrated_from")
  private Object migratedFrom;

  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public Boolean getAnswered() {
    return isAnswered;
  }

  public void setAnswered(Boolean answered) {
    isAnswered = answered;
  }

  public Integer getViewCount() {
    return viewCount;
  }

  public void setViewCount(Integer viewCount) {
    this.viewCount = viewCount;
  }

  public Integer getClosedDate() {
    return closedDate;
  }

  public void setClosedDate(Integer closedDate) {
    this.closedDate = closedDate;
  }

  public Integer getProtectedDate() {
    return protectedDate;
  }

  public void setProtectedDate(Integer protectedDate) {
    this.protectedDate = protectedDate;
  }

  public Integer getAcceptedAnswerId() {
    return acceptedAnswerId;
  }

  public void setAcceptedAnswerId(Integer acceptedAnswerId) {
    this.acceptedAnswerId = acceptedAnswerId;
  }

  public Integer getAnswerCount() {
    return answerCount;
  }

  public void setAnswerCount(Integer answerCount) {
    this.answerCount = answerCount;
  }

  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public Date getLastActivityDate() {
    return lastActivityDate;
  }

  public void setLastActivityDate(Date lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public Date getLastEditDate() {
    return lastEditDate;
  }

  public void setLastEditDate(Date lastEditDate) {
    this.lastEditDate = lastEditDate;
  }

  public Long getQuestionid() {
    return questionid;
  }

  public void setQuestionid(Long questionid) {
    this.questionid = questionid;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getClosedReason() {
    return closedReason;
  }

  public void setClosedReason(String closedReason) {
    this.closedReason = closedReason;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Object getMigratedFrom() {
    return migratedFrom;
  }

  public void setMigratedFrom(Object migratedFrom) {
    this.migratedFrom = migratedFrom;
  }
}
