package kh.edu.restfulapi.service;

import kh.edu.restfulapi.dto.UserCreateRequest;
import kh.edu.restfulapi.dto.UserResponse;
import kh.edu.restfulapi.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    void deleteById(UUID id);

    UserResponse create(UserCreateRequest userCreateRequest);

    List<UserResponse> getAll();

    User getByid(UUID id);
}
