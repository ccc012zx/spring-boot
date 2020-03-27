package com.example.demo.controller;

import com.example.demo.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: QQMacAir
 * @create: 27-03-2020
 **/
@RestController
public class SampleController {

  @Autowired
  private SampleService sampleService;
  @RequestMapping("index")
  public String index() {

    return sampleService.getIndex();
  }

}
