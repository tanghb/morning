package com.thb.user.batis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created by didi on 2017/5/23.
 */
@Mapper
@Component
public interface UserMapper {
    @Select("SELECT * FROM USER WHERE id = #{id}")
    User findById(@Param("id") int id);
}
