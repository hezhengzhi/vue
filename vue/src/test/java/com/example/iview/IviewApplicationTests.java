package com.example.iview;

import com.example.iview.entity.EaUser;
import com.example.iview.service.TestService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IviewApplicationTests {

    @Resource
    private TestService testService;

    @Test
    public void contextLoads() {
        List<EaUser>eaUsers=testService.findData();
        Assert.assertNotNull(eaUsers);
    }

}
