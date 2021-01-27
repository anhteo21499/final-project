package com.shopanh.demofillter.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Class {
    @Id   //column @tự động map với cột trên databases , nullable =false không co phép null.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private LocalDate createDate;
    @Column
    private long faculty_id;
//    @OneToMany(mappedBy = "clazz", fetch = FetchType.LAZY)
//    @JsonIgnore
//    private List<Student> listStudent = new ArrayList<>();

}
