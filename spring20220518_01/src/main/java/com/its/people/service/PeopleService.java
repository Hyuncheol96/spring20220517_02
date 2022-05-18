package com.its.people.service;

import com.its.people.dto.PeopleDTO;
import com.its.people.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {
    @Autowired
    private PeopleRepository peopleRepository;

    public void save(String val1, int val2) {
        System.out.println("PeopleService.save");
        System.out.println("name = " + val1 + ", val2 = " + val2);
        peopleRepository.save(val1, val2);
    }

    public boolean save1(PeopleDTO peopleDTO) {
        int saveResult = peopleRepository.save1(peopleDTO);
        if (saveResult > 0) {
            return true;
        } else {
            return false;
        }
    }
}
