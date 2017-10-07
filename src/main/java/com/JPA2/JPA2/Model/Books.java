package com.JPA2.JPA2.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Books {

    @Id
    private Integer book_id;
    private String book_name;

    @Override
    public String toString() {
        return "Books{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", authors=" + authors +
                '}';
    }

    @ManyToMany(mappedBy = "books")
    private Set<Author> authors;

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }


}
