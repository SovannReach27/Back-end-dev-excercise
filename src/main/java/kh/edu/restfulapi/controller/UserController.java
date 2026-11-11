package kh.edu.restfulapi.controller;

import kh.edu.restfulapi.dto.UserCreateRequest;
import kh.edu.restfulapi.dto.UserResponse;
import kh.edu.restfulapi.service.UserService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

@ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
public void deleteById(@PathVariable UUID id){
    userService.deleteById(id);
}


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public UserResponse create(@RequestBody  UserCreateRequest userCreateRequest){
        return userService.create(userCreateRequest);
    }
    @GetMapping
    public List<UserResponse> getAll(){
        return userService.getAll();
    }
}
