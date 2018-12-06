package com.example.iview.dao;

import com.example.iview.entity.EaUser;
import com.example.iview.entity.Vo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by pc on 2018/12/4 15:53
 **/
@Mapper
public interface TestDao {

    List<EaUser> findData();

    List<Vo> findByName(String name);
}

