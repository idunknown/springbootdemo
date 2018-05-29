package com.example.demo.service;

import java.util.List;
import java.util.Map;

/**
 * @author wuhy on 2018/5/29.
 */
public interface MyService {
    List getUser();
    boolean saveUser(Map map)throws Exception;
}
