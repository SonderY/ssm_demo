package wy.ssm.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wy.ssm.mapper.UserMapper;
import wy.ssm.pojo.User;
import wy.ssm.service.UserService;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public User selectByName(String name) {
     User user= userMapper.selectByName(name);
        return user;
    }

    public void insert(){
        User user ;
    }
}
