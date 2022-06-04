package com.example.demo.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {
	
 // @Select("SELECT * FROM MJATEST")
    List <HashMap<String, Object>> findAll();

}
