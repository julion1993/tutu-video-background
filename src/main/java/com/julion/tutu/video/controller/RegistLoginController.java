package com.julion.tutu.video.controller;

import com.julion.tutu.video.bean.Users;
import com.julion.tutu.video.service.UserService;
import com.julion.tutu.video.utils.JulionJSONResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistLoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/regist")
    public JulionJSONResult regist(@RequestBody Users user) {

        System.err.println(userService.queryUsernameIsExist(user.getUsername()));

        if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())) {

        }

        return JulionJSONResult.ok();
    }

}
