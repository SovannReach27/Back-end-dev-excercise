package kh.edu.restfulapi.model;

import com.google.errorprone.annotations.Var;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.type.descriptor.jdbc.VarcharUUIDJdbcType;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "m1_Products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true , nullable = false , length = 30)
    private String code;

    @Column( nullable = false , length = 128)
    private String name;

    @Column(nullable = false)
    private Integer quality;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private Boolean isAvailable;

    @ManyToOne
    private Categories categories;


}
