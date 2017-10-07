package com.JPA2.JPA2.Model;

import com.JPA2.JPA2.Repo.all_data_Inter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class all_data implements all_data_Inter {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public List<Map<String,Object>> booklist() {
        String sql="select book_id,book_name from books c,all_data b where b.bk_id=c.book_id and athr_id=2";
        List<Map<String,Object>>li= jdbcTemplate.queryForList(sql);
        return li;
    }
}
