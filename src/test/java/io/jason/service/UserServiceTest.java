package io.jason.service;

import io.jason.App;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

/**
 * Created by Jason on 16/8/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)

public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Before
    public void setUp() {
        System.out.println("setup ~~~");
    }

    @Test
    public void getMyTime() throws Exception {
        String mytime = userService.myTime();
        assertTrue(mytime != null);
    }
}

