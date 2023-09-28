package com.akk.growbiz.userapp.api;


import com.akk.growbiz.userapp.controller.UserApiDelegate;
import com.akk.growbiz.userapp.model.User;
import com.akk.growbiz.userapp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserApiDelegateImpl implements UserApiDelegate {

    @Autowired
    UserService userService;
    @Override
    public ResponseEntity<User> getUserByName(String username) {
        log.info("username", username);
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<User> createUser(User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }
}
