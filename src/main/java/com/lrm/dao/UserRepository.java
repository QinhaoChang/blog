package com.lrm.dao;

import com.lrm.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Qinhao on 2025/09/26.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}
