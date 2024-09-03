package com.jerry.myapiinterface;

import com.jerry.myapiclientsdk.client.MyApiClient;
import com.jerry.myapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MyapiInterfaceApplicationTests {

    @Resource
    private MyApiClient myApiClient;

    @Test
    void contextLoads() {
        String result = myApiClient.getNameByGet("jerry1");
        System.out.println(result);
        String result2 = myApiClient.getNameByPost("jerry2");
        System.out.println(result2);
        User user = new User();
        user.setUsername("jerry3");
        String result3 = myApiClient.getUserNameByPost(user);
        System.out.println(result3);
    }

}
