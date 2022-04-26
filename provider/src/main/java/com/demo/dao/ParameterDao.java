package com.demo.dao;

import com.demo.entity.telex.Parameter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ParameterDao {

    @Select("select * from telex_parameter")
    @ResultType(Parameter.class)
    List<Parameter> findAll();

}
