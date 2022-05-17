package com.its.dbex.service;

import com.its.dbex.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {
    @Autowired
    private DataRepository dataRepository;

    //호출이 됨
    public void save(String val1, String val2){
        System.out.println("DataService.save");
        System.out.println("val1 = " + val1 + ", val2 = " + val2);
        dataRepository.save(val1, val2);

    }


}
