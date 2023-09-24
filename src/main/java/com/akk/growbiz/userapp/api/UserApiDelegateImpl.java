package com.akk.growbiz.userapp.api;


import com.akk.growbiz.userapp.controller.UserApiDelegate;
import com.akk.growbiz.userapp.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserApiDelegateImpl implements UserApiDelegate {

    @Override
    public ResponseEntity<User> getUserByName(String username) {
        log.info("username", username);
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
