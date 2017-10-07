package com.JPA2.JPA2.Repo;

import com.JPA2.JPA2.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Author_inter extends JpaRepository<Author,Integer> {
   public Author findByAuthorId(Integer author_id);
}

