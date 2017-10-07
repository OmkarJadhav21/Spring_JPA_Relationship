package com.JPA2.JPA2.Controller;

import com.JPA2.JPA2.Model.Department;
import com.JPA2.JPA2.Model.Student;
import com.JPA2.JPA2.Repo.Dept_inter;
import com.JPA2.JPA2.Repo.Stud_inter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class St_Controller {

    @Autowired
    Stud_inter stud_inter;

    @Autowired
    Dept_inter dept_inter;

    @PostMapping(value = "/insert")
    String insert(@RequestBody Student student){
        stud_inter.save(student);
        return "data inserted ";
    }

    @PostMapping(value = "/joinBoth")       // One-to-many relationship
    String join(@RequestBody Student student){
        Department dep=student.getDepartment();
        if (dept_inter.findOne(dep.getDept_id())!=null){
            stud_inter.save(student);
        }else {
                dept_inter.save(dep);
                stud_inter.save(student);
              }
        return "success";
    }

    @PostMapping(value = "/joinDelete")
    String delete(@RequestParam Integer dept_id){
        dept_inter.delete(dept_id);
        return "Values Deleted from both tables with associated id";

    }
}
