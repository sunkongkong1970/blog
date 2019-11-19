package com.skk.service;

import com.skk.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
