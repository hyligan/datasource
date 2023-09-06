package com.goit.datasource.repo.remote;

import com.goit.datasource.entiteis.remote.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface WorkerRepo extends JpaRepository<Worker, Long> {
  @Query("select w.workerId from Worker w where w.name = :name")
  Optional<Long> findByName(@Param("name") String name);
}
