package com.akk.growbiz.userapp.mapper;

import com.akk.growbiz.userapp.entity.UserEntity;
import com.akk.growbiz.userapp.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity toEntity(User user);

    User toUser(UserEntity target);
}
