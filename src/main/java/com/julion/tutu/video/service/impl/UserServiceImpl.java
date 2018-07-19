package com.julion.tutu.video.service.impl;

import com.julion.tutu.video.bean.Users;
import com.julion.tutu.video.mapper.UsersMapper;
import com.julion.tutu.video.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public boolean queryUsernameIsExist(String username) {
        int count = usersMapper.queryUsernameIsExist(username);
        if(count > 0) {
            return true;
        }
        return false;
    }

    @Override
    public int saveUser(Users user) {
        return 0;
    }
}
