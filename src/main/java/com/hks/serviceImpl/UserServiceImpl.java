package com.hks.serviceImpl;

import com.hks.dao.UserRepository;
import com.hks.po.User;
import com.hks.service.UserService;
import com.hks.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 河丶神
 * @date 2021/6/17 14:17
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
