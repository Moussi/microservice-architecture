package com.moussi.microservice1client;

import com.moussi.microservice1client.rest.LuckWorldController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by moussiaymen on 24/05/17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntegrationTest {

    @Autowired
    LuckWorldController luckWorldController;

    @Test
    public void contextLoads() {
        //	Ensure that the context loads, the properties are loaded, and the lucky word
        //	controller is correctly wired with the correct value:
        Assert.assertTrue("The lucky word is: testing".equals(luckWorldController.showLuckyWord()));
    }

    //	Load test properties to satisfy the lucky-word placeholder:
    @Configuration
    @Import(Microservice1ClientApplication.class)
    @PropertySource("classpath:test.properties")
    public static class Config {

    }
}
