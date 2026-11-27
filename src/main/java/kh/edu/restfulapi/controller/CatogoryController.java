package kh.edu.restfulapi.controller;


import kh.edu.restfulapi.dto.CategoryResponse;
import kh.edu.restfulapi.dto.CatogoryCreateRequest;
import kh.edu.restfulapi.dto.UserCreateRequest;
import kh.edu.restfulapi.dto.UserResponse;
import kh.edu.restfulapi.repositiory.CategoryRepository;
import kh.edu.restfulapi.service.CatogoryService;
import kh.edu.restfulapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class CatogoryController {

    private final UserService userService;
    private final CategoryRepository categoryRepository;
    private final CatogoryService catogoryService;

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id){
        categoryRepository.deleteById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public CategoryResponse create(@RequestBody CatogoryCreateRequest catogoryCreateRequest){
        return catogoryService.create(catogoryCreateRequest);
    }
    @GetMapping
    public List<UserResponse> getAll(){
        return userService.getAll();
    }

    public CategoryResponse getById(@PathVariable UUID id){
        return catogoryService.getById(id);
    }
}
