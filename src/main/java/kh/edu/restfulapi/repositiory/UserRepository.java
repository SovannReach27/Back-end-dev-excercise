package kh.edu.restfulapi.repositiory;

import kh.edu.restfulapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Repository
public class UserRepository {


    private final List<User> users;

    public UserRepository(){
        User user1 = new User(UUID.randomUUID(), "admin", "hello", "Sovann Reach", true);
        User user2 = new User(UUID.randomUUID(), "Editor", "hello", "Sovann Reach", true);
        User user3 = new User(UUID.randomUUID(), "Customer", "hello", "Sovann Reach", true);
        users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

    }

    public boolean checkById(UUID id){
        return users.stream()
                .anyMatch(user -> user.getId().equals(id));
    }

    public List<User> selectALl() {
        return users;
    }

    public void insertOne(User user){
        users.add(user);
    }

    public void deleteOne(UUID id){
        users.removeIf(user -> user.getId().equals(id));
    }
}
