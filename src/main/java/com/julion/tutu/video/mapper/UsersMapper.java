package com.julion.tutu.video.mapper;

import com.julion.tutu.video.bean.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {

    int queryUsernameIsExist(String username);

}