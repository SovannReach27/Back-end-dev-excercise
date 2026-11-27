package kh.edu.restfulapi.service.impl;

import kh.edu.restfulapi.dto.CategoryResponse;
import kh.edu.restfulapi.dto.CatogoryCreateRequest;
import kh.edu.restfulapi.dto.UserResponse;
import kh.edu.restfulapi.model.Categories;
import kh.edu.restfulapi.model.User;
import kh.edu.restfulapi.repositiory.CategoryRepository;
import kh.edu.restfulapi.service.CatogoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
@Slf4j

public class CatogoryServicelmpl implements CatogoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public void deleteById(UUID id) {
    }

    @Override
    public CategoryResponse create(CatogoryCreateRequest catogoryCreateRequest) {
        Categories categories = new Categories();
        categories.getName();
        categories.getIcon();
        categories.getId();


        Categories savedCategories = categoryRepository.save(categories);
        log.info("After saving user: {}", categories.getId());

        return CategoryResponse.builder()
                .icon(savedCategories.getIcon())
                .name(savedCategories.getName())
                .build();
    }

    @Override
    public List<CategoryResponse> getAll() {
        return categoryRepository.findAll()
                .stream()
                .map(categories -> CategoryResponse.builder()
                        .icon(categories.getIcon())
                        .name(categories.getName())

                        .build())
                .toList();
    }

    @Override
    public Categories getByid(UUID id) {
        return null;
    }

    @Override
    public CategoryResponse getById(UUID id) {
        return categoryRepository.findById(id)
                .map(categories -> CategoryResponse.builder()
                        .icon(categories.getIcon())
                        .name(categories.getName())
                        .build())
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource not found"));
    }
}


