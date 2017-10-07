package com.JPA2.JPA2.Repo;

import com.JPA2.JPA2.Model.Author;
import com.JPA2.JPA2.Model.Books;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface all_data_Inter {

    List<Map<String,Object>> booklist();
}
