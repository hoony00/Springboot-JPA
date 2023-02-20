package com.example.blog.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100)
    private String userName;

    @Column(length = 100)
    private String passWord;

    @Column(length = 100)
    private String email;

    @ColumnDefault("'user'")
    private String role; //Enum 교체예정

    @CreationTimestamp
    private Timestamp createDate;

    @OneToMany(mappedBy = "user")
    List<Board> boards;

    @OneToMany(mappedBy = "board")
    List<Reply> replys;
}
