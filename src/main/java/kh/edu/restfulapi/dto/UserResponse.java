package kh.edu.restfulapi.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record UserResponse(
        UUID id,
        String fullname,
        Boolean isActive
) {
}
