package kh.edu.restfulapi.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="m1_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true , nullable = false , length = 50)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false , length = 50)
    private String fullname;

    @Column(nullable = false)
    private Boolean isActive;

    @OneToOne(mappedBy = "user")
    private Customer customer;
}
