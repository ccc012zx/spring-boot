package com.example.demo.service;

import com.example.demo.dao.SampleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author:
 * @create: 27-03-2020
 **/
@Service
public class SampleService {

  @Autowired
  private SampleDao sampleDao;

  public String getIndex() {
    return sampleDao.getIndex();
  }
}
