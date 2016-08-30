package io.jason.controller;

import io.jason.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jason on 16/8/29.
 */


@RestController
public class UserController {
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    UserService us;

    @RequestMapping(value = "/testhello", method = RequestMethod.GET)
    public String testhello() throws Exception {
        return us.myTime();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() throws Exception {
        return "welcome ~";
    }
}
