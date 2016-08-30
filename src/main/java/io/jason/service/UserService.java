package io.jason.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jason on 16/8/29.
 */
@Service
public class UserService {

    protected final Log logger = LogFactory.getLog(getClass());

    public String myTime () {
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH");
        Date date =new Date();
        String time= sdf.format(date.getTime()) + "时";
        String time1= "截止至 " + time;
        System.out.println(time1);
        return time1;
    }
}
