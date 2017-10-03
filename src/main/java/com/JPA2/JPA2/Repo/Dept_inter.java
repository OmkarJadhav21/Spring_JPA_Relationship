package com.JPA2.JPA2.Repo;

import com.JPA2.JPA2.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Dept_inter extends JpaRepository<Department,Integer> {
}
