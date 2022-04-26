package com.demo.api.impl;

import com.demo.api.service.ConfigService;
import com.demo.dao.ParameterDao;
import com.demo.entity.telex.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConfigServiceImpl implements ConfigService {

    @Autowired
    private ParameterDao parameterDao;

    @Override
    public List<Parameter> findAll() {
        return parameterDao.findAll();
    }
}
