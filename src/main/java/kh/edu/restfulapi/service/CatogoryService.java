package kh.edu.restfulapi.service;

import kh.edu.restfulapi.dto.CategoryResponse;
import kh.edu.restfulapi.dto.CatogoryCreateRequest;
import kh.edu.restfulapi.model.Categories;


import java.util.List;
import java.util.UUID;

public interface CatogoryService {

    void deleteById(UUID id);

    CategoryResponse create(CatogoryCreateRequest catogoryCreateRequest);

    List<CategoryResponse> getAll();

    Categories getByid(UUID id);

    CategoryResponse getById(UUID id);
}
