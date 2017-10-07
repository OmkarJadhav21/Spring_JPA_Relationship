package com.JPA2.JPA2.Repo;

import com.JPA2.JPA2.Model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface pet_intr extends JpaRepository<Pet,String > {
    @Query("select q from pet")
    public List<String> trythis();
}
