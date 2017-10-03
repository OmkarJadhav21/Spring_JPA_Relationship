package com.JPA2.JPA2.Repo;

import com.JPA2.JPA2.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Stud_inter extends JpaRepository<Student,Integer> {
}
