package com.goit.datasource.dto;


import java.math.BigDecimal;

public class CustomeWorkerNew {

  private String nameWorker;
  private String salaryWorker;
  
  private BigDecimal salary;

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }

  public String getNameWorker() {
    return nameWorker;
  }

  public void setNameWorker(String nameWorker) {
    this.nameWorker = nameWorker;
  }

  public String getSalaryWorker() {
    return salaryWorker;
  }

  public void setSalaryWorker(String salaryWorker) {
    this.salaryWorker = salaryWorker;
  }
}
