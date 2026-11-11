package kh.edu.restfulapi.dto;

import java.util.UUID;

public record UserResponse(
        UUID id,
        String fullname,
        Boolean isActive
) {
}
