package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author  wuhy on 2017/11/18.
 */
@Mapper
public interface UserMapper {
    List<Map> selectPrice(Map map);
    boolean saveUser(Map map);

}
