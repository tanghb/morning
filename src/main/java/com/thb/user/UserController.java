package com.thb.user;

import com.thb.user.batis.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by didi on 2017/5/22.
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    public String index() {

        return "Huaibao, Hello World" + userMapper.findById(1).getName();
    }

}
