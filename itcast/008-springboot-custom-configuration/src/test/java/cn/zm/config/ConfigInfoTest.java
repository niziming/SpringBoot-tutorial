package cn.zm.config;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConfigInfoTest {
    @Autowired
    ConfigInfo configInfo;

    @Test
    public void printInfo(){
        System.out.println("configInfo = " + configInfo);
    }
}