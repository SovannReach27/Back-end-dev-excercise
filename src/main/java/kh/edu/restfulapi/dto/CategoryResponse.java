package kh.edu.restfulapi.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record CategoryResponse(
        UUID id,
        String name,
        String icon
) {

}
