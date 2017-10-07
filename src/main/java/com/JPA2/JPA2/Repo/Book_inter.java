package com.JPA2.JPA2.Repo;

import com.JPA2.JPA2.Model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Book_inter extends JpaRepository<Books,Integer>{
}
