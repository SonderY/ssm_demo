package wy.ssm.service;

import org.springframework.stereotype.Service;
import wy.ssm.pojo.User;

@Service
public interface UserService {
    User selectByName(String name);
}
