package com.goit.datasource.service.impl;

import com.goit.datasource.repo.remote.WorkerRepo;
import com.goit.datasource.service.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
  private final WorkerRepo repo;

  public ServiceImpl(WorkerRepo repo) {
    this.repo = repo;
  }

  @Override
  @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
  public void makeService() {

  }

}
