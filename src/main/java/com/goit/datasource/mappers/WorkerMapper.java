package com.goit.datasource.mappers;

import com.goit.datasource.dto.CustomeWorkerNew;
import com.goit.datasource.entiteis.remote.Worker;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface WorkerMapper {
  @Mapping(target = "nameWorker", source = "name")
  CustomeWorkerNew toCustomeWorkerNew(Worker worker);
  
  default BigDecimal calculateSalary(String salary){
    return new BigDecimal(salary);
  }
  
  List<CustomeWorkerNew> asListCustomeWorkerNew(List<Worker> workerList);
  
}
