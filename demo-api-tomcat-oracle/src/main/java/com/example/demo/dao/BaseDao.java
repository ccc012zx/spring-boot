package com.example.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.DataSource;
import oracle.jdbc.pool.OracleDataSource;
import org.springframework.beans.factory.annotation.Value;

/**
 * @description:
 * @author:
 * @create: 27-03-2020
 **/
public class BaseDao {


  @Value("${spring.datasource.url}")
  private String url;

  @Value("${spring.datasource.username}")
  private String usename;

  //建议密码改成动态获取
  @Value("${spring.datasource.password}")
  private String pwd;

  // oracle
  // refer to: https://docs.oracle.com/cd/B28359_01/java.111/b31224/urls.htm
  public DataSource oracleDataSource() {
    OracleDataSource ods = null;
    try {
      // create an OracleDataSource
      ods = new OracleDataSource();
      // set connection properties
      java.util.Properties prop = new java.util.Properties();
      prop.put("user", usename);
      prop.put("password", pwd);
      ods.setConnectionProperties(prop);
      // set the url
      // the url can use oci driver as well as:
      // url = "jdbc:oracle:oci8:@inst1"; the inst1 is a remote database
      ods.setURL(url);

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return ods;
  }

  public Connection mysqlConnection(){
    String driver = "com.mysql.cj.jdbc.Driver";

    Connection conn = null;
    try {
      Class.forName(driver);
      conn = DriverManager.getConnection(url, usename, pwd);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return conn;
  }

}
