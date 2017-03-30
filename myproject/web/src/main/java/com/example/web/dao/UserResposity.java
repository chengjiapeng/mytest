package com.example.web.dao;

import com.example.web.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by chengjiapeng on 2017/3/23.
 */
public interface UserResposity extends JpaRepository<User, Long>{
    @Query("select u from User u where u.username=:username")
    User findByUserName(@Param("username")String username);
}
