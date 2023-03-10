package com.example.restfulwebservice.post;

import com.example.restfulwebservice.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue
    private int id;

    private String description;

    // User : Post (Main : Sub) (Parent : child)
    // Post 데이터는 여러개 올 수 있고 User 는 한 개와 매칭될 수 있다.
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;
}
