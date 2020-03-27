package com.example.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author:
 * @create: 27-03-2020
 **/
@Component
public class SampleDao extends BaseDao {

  public String getIndex() {
    String result = "index";
    String sql = "select '1' from dual";
    try {
      Connection conn = mysqlConnection();
      PreparedStatement ps = conn.prepareStatement(sql);
      ResultSet resultSet = ps.executeQuery();
      while (resultSet.next()) {
        result = resultSet.getString(1);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return result;

  }
}
