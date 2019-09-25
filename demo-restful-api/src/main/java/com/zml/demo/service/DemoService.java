package com.zml.demo.service;

import com.zml.demo.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: QQMacAir
 * @create: 24-09-2019
 **/
@Component
public class DemoService {

  @Autowired
  private DemoDao demoDao;

  public String getAll() {
    return demoDao.getAll();
  }
}
