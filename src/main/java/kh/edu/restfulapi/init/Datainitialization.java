package kh.edu.restfulapi.init;


import jakarta.annotation.PostConstruct;
import kh.edu.restfulapi.model.User;
import kh.edu.restfulapi.repositiory.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Datainitialization {

    public final UserRepository userRepository;

    @PostConstruct
    void init(){
        if (userRepository.count() == 0 ){
            User user = new User();
            user.setFullname("Adminstator");
            user.setUsername("admin");
            user.setPassword("1234");
            user.setIsActive(true);

            User user2 = new User();
            user2.setFullname("Editor");
            user2.setUsername("Edit");
            user2.setPassword("1234");
            user2.setIsActive(true);

            userRepository.save(user);
            userRepository.save(user2);

        }
    }


}
