package com.thb.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by didi on 2017/5/22.
 */
@RestController
public class UserController {

    @RequestMapping("/hello")
    public String index() {
        return "Huaibao, Hello World";
    }

}
