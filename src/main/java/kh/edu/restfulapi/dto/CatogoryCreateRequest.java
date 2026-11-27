package kh.edu.restfulapi.dto;

import java.util.UUID;

public record CatogoryCreateRequest(
        String icon,
        String name,
        UUID id
) {
}
