package com.lrm.service;

import com.lrm.po.User;

/**
 * Created by Qinhao on 2025/09/26.
 */
public interface UserService {

    User checkUser(String username, String password);
}
