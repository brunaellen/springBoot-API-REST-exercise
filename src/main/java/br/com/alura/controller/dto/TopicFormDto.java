package br.com.alura.controller.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class TopicFormDto {
  
  @NotNull @NotEmpty @Length(min = 5)
  private String title;
  @NotNull @NotEmpty @Length(min = 10)
  private String message;
  @NotNull @NotEmpty
  private String courseName;

  public TopicFormDto(String title, String message, String courseName) {
    this.title = title;
    this.message = message;
    this.courseName = courseName;
  }

  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public String getMessage() {
    return message;
  }
  
  public void setMessage(String message) {
    this.message = message;
  }
  
  public String getCourseName() {
    return courseName;
  }
  
  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }
}