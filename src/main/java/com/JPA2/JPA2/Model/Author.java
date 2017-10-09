package com.JPA2.JPA2.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Author {

    @Id
   private Integer authorId;
   private String author_name;

    @Override
    public String toString() {
        return "Author{" +
                "author_id=" + authorId +
                ", author_name='" + author_name + '\'' +
                ", books=" + books +
                '}';
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "all_data_Impl",joinColumns = @JoinColumn(name = "athr_id",referencedColumnName = "authorId"),inverseJoinColumns = @JoinColumn(name = "bk_id",referencedColumnName = "book_id"))
    Set<Books> books;

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public Set<Books> getBooks() {
        return books;
    }

    public void setBooks(Set<Books> books) {
        this.books = books;
    }




}
