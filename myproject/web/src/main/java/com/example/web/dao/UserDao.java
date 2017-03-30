package com.example.web.dao;

import com.example.web.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by chengjiapeng on 2017/3/23.
 */
public interface UserDao {
    void register();


}
