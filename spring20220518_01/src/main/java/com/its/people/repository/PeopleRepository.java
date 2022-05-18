package com.its.people.repository;


import com.its.people.dto.PeopleDTO;
import com.its.people.service.PeopleService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PeopleRepository {
    @Autowired
    private SqlSessionTemplate sql;
    public void save(String val1, int val2) {
        // 넘겨받은 name, age를 PeopleDTO 객체에 담자
        PeopleDTO peopleDTO = new PeopleDTO();
        peopleDTO.setName(val1);
        peopleDTO.setAge(val2);


        System.out.println("PeopleRepository.save");
        System.out.println("name = " + val1 + ", age = " + val2);
        sql.insert("People.save", peopleDTO);
        // sql.insert("People.save", val1);
    }

    public int save1(PeopleDTO peopleDTO) {
        return sql.insert("People.save", peopleDTO);
    }
}
