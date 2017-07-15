package com.thb.user.batis;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * Created by didi on 2017/5/23.
 */
@Mapper
@Component
public interface UserMapper {
    @Select("SELECT * FROM user WHERE id = #{id}")
    User findById(@Param("id") int id);

    @Insert("INSERT INTO user (name, sex) VALUES (#{user.name}, #{user.sex})")
    @Options(useGeneratedKeys = true, keyProperty = "user.id")
    void insertUser(@Param("user") User user);
}
