package com.JPA2.JPA2.Repo;

import com.JPA2.JPA2.Model.Author;
import com.JPA2.JPA2.Model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface Author_inter extends JpaRepository<Author,Integer> {
   public Author findByAuthorId(Integer author_id);
}

