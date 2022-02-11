package com.hks.service;

import com.hks.po.User;

/**
 * @author 河丶神
 * @date 2021/6/17 14:16
 */
public interface UserService {

    User checkUser(String username, String password);
}
