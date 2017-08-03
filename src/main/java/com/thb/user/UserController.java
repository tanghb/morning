package com.thb.user;

import com.thb.user.batis.User;
import com.thb.user.batis.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by didi on 2017/5/22.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @RequestMapping(value = "/index.do", method = RequestMethod.GET)
    public @ResponseBody User index(@RequestParam int id) {
        return userMapper.findById(id);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public @ResponseBody User insert(@RequestBody User user) {
        userMapper.insertUser(user);
        return userMapper.findById(user.getId());
    }

}
