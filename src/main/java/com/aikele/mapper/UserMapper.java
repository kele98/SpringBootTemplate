package com.aikele.mapper;

import com.aikele.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAll();
}
