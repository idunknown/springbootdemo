package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author wuhy on 2018/5/23.
 */
public abstract class AbstractJdbcDaoSupport {
    @Autowired
    protected JdbcTemplate jdbcTemplate;
}


