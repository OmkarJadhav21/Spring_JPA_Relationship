package com.JPA2.JPA2.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Department {

    @Id
    Integer dept_id;
    String dept_name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
       Set<Student> students;

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dept_id=" + dept_id +
                ", dept_name='" + dept_name + '\'' +
                ", students=" + students +
                '}';
    }



    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }



}
