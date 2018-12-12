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


    private void method(String string){
        System.out.println("String");
    }
    private void method(Object object){
        System.out.println("Object");
    }
    private void method(Integer integer){
        System.out.println("String");
    }

    public static void main(String[] args) {
        IviewApplicationTests a=new IviewApplicationTests();
        a.method(2);
    }
}
