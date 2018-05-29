package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author wuhy on 2018/5/29.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MyServiceImpl implements MyService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List getUser() {
       return userMapper.selectPrice(null);
    }

    @Override
    public boolean saveUser(Map map) throws Exception{
        userMapper.saveUser(map);
        String a=null;
        a.equals("");
        return userMapper.saveUser(map);
    }

}
