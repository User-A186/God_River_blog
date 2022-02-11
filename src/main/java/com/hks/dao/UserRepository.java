package com.hks.dao;

import com.hks.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 河丶神
 * @date 2021/6/17 14:18
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);
}
