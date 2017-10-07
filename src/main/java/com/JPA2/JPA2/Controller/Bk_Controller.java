package com.JPA2.JPA2.Controller;

import com.JPA2.JPA2.Model.Author;
import com.JPA2.JPA2.Model.Books;
import com.JPA2.JPA2.Repo.Author_inter;
import com.JPA2.JPA2.Repo.Book_inter;
import com.JPA2.JPA2.Repo.all_data_Inter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class Bk_Controller {

    @Autowired
    Book_inter book_inter;

    @Autowired
    Author_inter author_inter;

    @Autowired
    all_data_Inter all_data_inter;

    @PostMapping(value = "/manytomanyAuthor")
    String manyauthor(@RequestBody Author author){
        Integer author_id = author.getAuthorId();
        Author dbAuthor = author_inter.findByAuthorId(author_id);
        if(dbAuthor!=null){
            Set<Books> booksSet = dbAuthor.getBooks();
            booksSet.addAll(author.getBooks());
            author.setBooks(booksSet);
            author_inter.save(author);
            return "data inserted into Author where id already present";
        }else {
            author_inter.save(author);
            return "data inserted into Author";
        }
    }

    @GetMapping(value = "/manytomanyDelete")
    String manydelete(@RequestParam Integer id){
        author_inter.delete(id);
        return "Data Deleted from All tables";
    }

    @GetMapping(value = "/booklist")
    List<Map<String,Object>> booksList(@RequestParam Integer author_id ){
    List<Map<String,Object>>li=all_data_inter.booklist(author_id);
    return li;
    }
}
