package com.moon.account.dao;

import com.moon.account.model.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    SysUser findByUserName(String username);
}
