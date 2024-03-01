package pl.tdelektro.carhelper.pojo;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "user_dto")
@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "category")
    String category;

    @Column(name = "platform")
    String platform;

    @Column(name = "rating")
    String rating;

    @Column(name = "score")
    Double score;

    @Column(name = "actor")
    String actor;

}
