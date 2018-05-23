package com.example.demo;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author wuhy on 2018/5/23.
 */
@Repository
public class test extends AbstractJdbcDaoSupport{


    private String querySql = "SELECT * FROM user  ";




    public String getPassword(final String username) {
        String passwd = jdbcTemplate.query(querySql, new ResultSetExtractor<String>() {


            @Override
            public String extractData(ResultSet rs) throws SQLException, DataAccessException {
                System.out.println(rs);
                return null;
            }
        });
        return "geg";
    }



}
