package com.goit.datasource.repo.locale;

import com.goit.datasource.entiteis.locale.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepo extends JpaRepository<Salary, Long> {
}
