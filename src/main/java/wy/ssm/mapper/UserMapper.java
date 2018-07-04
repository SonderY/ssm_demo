package wy.ssm.mapper;

import wy.ssm.pojo.User;

public interface UserMapper {
   void  insert(UserMapper userMapper);
//    void  delete(Integer id);
    User selectByName(String name);
}
