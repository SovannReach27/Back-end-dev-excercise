package kh.edu.restfulapi.service.impl;


import kh.edu.restfulapi.dto.UserCreateRequest;
import kh.edu.restfulapi.dto.UserResponse;
import kh.edu.restfulapi.model.User;
import kh.edu.restfulapi.repositiory.UserRepository;
import kh.edu.restfulapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void deleteById(UUID id) {
        if (!userRepository.checkById(id)){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,"User Not Found  "
            );
        }

        userRepository.deleteOne(id);
    }


    @Override
    public UserResponse create(UserCreateRequest userCreateRequest){
        User user = new User();
        user.setUsername(userCreateRequest.username());
        user.setPassword(userCreateRequest.password());
        user.setFullname(userCreateRequest.fullname());

        //
        user.setId(UUID.randomUUID());
        user.setIsActive(true);

        //
        userRepository.insertOne(user);

        //

        return new UserResponse(
                user.getId(),
                user.getFullname(),
                user.getIsActive()
        );
    }


    @Override
    public List<UserResponse> getAll() {

        return userRepository.selectALl()
                .stream()
                .map(user -> new UserResponse(
                        user.getId(),
                        user.getFullname(),
                        user.getIsActive()))
                .toList();
    }

    @Override
    public User getByid(UUID id) {
        return null;
    }

}
