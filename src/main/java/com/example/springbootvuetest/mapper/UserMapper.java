package com.example.springbootvuetest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootvuetest.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from t_user")
    List<User> selectAllUsers();
}
