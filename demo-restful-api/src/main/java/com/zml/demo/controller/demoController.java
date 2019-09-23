package com.zml.demo.controller;

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
public class demoController {

  @GetMapping("get-hello")
  public String getAll() {
    return "HELLO";
  }
}
