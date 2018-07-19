package com.julion.tutu.video.service;

import com.julion.tutu.video.bean.Users;

public interface UserService {

    boolean queryUsernameIsExist(String username);

    int saveUser(Users user);

}
