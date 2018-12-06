package com.example.iview.service;

import com.example.iview.entity.EaUser;
import com.example.iview.entity.Vo;

import java.util.List;

/**
 * Created by pc on 2018/12/4 15:54
 **/
public interface TestService {
    List<EaUser> findData();

    List<Vo> findByName(String name);
}
