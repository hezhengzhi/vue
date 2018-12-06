package com.example.iview.service.impl;

import com.example.iview.dao.TestDao;
import com.example.iview.entity.EaUser;
import com.example.iview.entity.Vo;
import com.example.iview.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by pc on 2018/12/4 15:54
 **/
@Service("testService")
public class TestServiceImpl implements TestService {
    @Resource
    private TestDao testDao;

    @Override
    public List<EaUser> findData() {
        return testDao.findData();
    }

    @Override
    public List<Vo> findByName(String name) {
        return testDao.findByName(name);
    }
}
