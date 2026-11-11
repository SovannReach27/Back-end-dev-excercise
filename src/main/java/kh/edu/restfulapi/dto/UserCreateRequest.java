package kh.edu.restfulapi.dto;


public record UserCreateRequest(
        String username,
        String password,
        String fullname
) {

}
