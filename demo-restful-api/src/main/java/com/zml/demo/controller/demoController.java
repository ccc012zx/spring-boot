package com.zml.demo.controller;

import com.zml.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: QQMacAir
 * @create: 24-09-2019
 **/
@RestController
@RequestMapping("/app")
public class DemoController {

  @Autowired
  private DemoService demoService;

  @GetMapping("get-hello")
  public String getAll() {
    return demoService.getAll();
  }
}
