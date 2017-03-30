package com.example.web.dao;

import org.springframework.stereotype.Service;

/**
 * Created by chengjiapeng on 2017/3/23.
 */
@Service
public class UserDaoImpl implements UserDao{
    @Override
    public void register() {
        System.out.println("a user has been registered");
    }
}
