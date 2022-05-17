package com.its.dbex.controller;

import com.its.dbex.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataController {

  @Autowired
  private DataService dataService;

  @GetMapping("save-form")
  public String saveForm() {
    return "save-form";
  }
  @PostMapping("/save")
  public  String save(@RequestParam("val1") String val1, @RequestParam("val2") String val2) {
    System.out.println("val1 = " + val1 + ", val2 = " + val2);
    dataService.save(val1, val2);
    System.out.println("DataController.saveform");
    return null;
  }


}



















