package com.goit.datasource.dto;



public class CustomeWorker {
  public CustomeWorker() {
  }

  private String name;
  private String salary;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSalary() {
    return salary;
  }

  public void setSalary(String salary) {
    this.salary = salary;
  }

  public CustomeWorker(String name, String salary) {
    this.name = name;
    this.salary = salary;
  }
}
