package com.goit.datasource.controllers;

import com.goit.datasource.entiteis.remote.Worker;
import com.goit.datasource.repo.locale.SalaryRepo;
import com.goit.datasource.repo.remote.WorkerRepo;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/warker")
public class WorkerController {
  private final WorkerRepo repo;
  private final SalaryRepo salaryRepo;

  public WorkerController(WorkerRepo repo, SalaryRepo salaryRepo) {
    this.repo = repo;
    this.salaryRepo = salaryRepo;
  }
  @GetMapping
  public List<Map<String, String>> getAllSalaries(){
    return repo.findAll().stream().map(worker -> {
      Map<String, String> resp = new HashMap<>();
      resp.put("name",worker.getName());
      if(Objects.nonNull(worker.getSalaryId())) {
        salaryRepo.findById(worker.getSalaryId()).ifPresent(salary ->
            resp.put("salary", salary.getSalary()));
      }
      resp.put("level", worker.getLevel());
      resp.put("bd",new SimpleDateFormat("dd.MM.yyyy").format(worker.getBirthday()));
      return resp;
    }).collect(Collectors.toList());
  }
  @PostMapping
  public Long saveSalary(@RequestBody Worker salary){
    return repo.save(salary).getWorkerId();
  }
}
