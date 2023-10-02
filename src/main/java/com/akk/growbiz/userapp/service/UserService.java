package com.akk.growbiz.userapp.service;

import com.akk.growbiz.userapp.entity.UserEntity;
import com.akk.growbiz.userapp.mapper.UserMapper;
import com.akk.growbiz.userapp.model.User;
import com.akk.growbiz.userapp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    UserMapper userMapper;

    public User createUser(User user) {

        UserEntity userEntity = userMapper.toEntity(user);

        return userMapper.toUser(userRepo.save(userEntity));

    }

    public User getUser(String userName) {

        return userMapper.toUser(userRepo.findUserByUserName(userName));

    }
}
