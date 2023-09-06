package com.goit.datasource.entiteis.remote;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity 
@Table(name = "worker")
public class Worker {

  @Id
  @GeneratedValue
  private Long workerId;
  private String name;
  private Date birthday;
  private String level;
  private Long salaryId;


  public Long getWorkerId() {
    return workerId;
  }

  public void setWorkerId(Long workerId) {
    this.workerId = workerId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public Long getSalaryId() {
    return salaryId;
  }

  public void setSalaryId(Long salaryId) {
    this.salaryId = salaryId;
  }
}
