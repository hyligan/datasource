package com.goit.datasource.controllers;

import com.goit.datasource.entiteis.locale.Salary;
import com.goit.datasource.repo.locale.SalaryRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salary")
public class SalaryController {
  private final SalaryRepo repo;

  public SalaryController(SalaryRepo repo) {
    this.repo = repo;
  }
  @GetMapping
  public List<Salary> getAllSalaries(){
    return repo.findAll();
  }
  @PostMapping
  public Long saveSalary(@RequestBody Salary salary){
    return repo.save(salary).getId();
  }
}
