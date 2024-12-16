package com.codej.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "El nombre es obligatorio")
    @Column(nullable = false)
    private String name;
    @NotBlank(message = "El apellido es obligatorio")
    @Column(length = 50, nullable = false)
    private String lastname;
    @NotBlank(message = "El dni es obligatorio")
    private String dni;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String photo;


    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Post> posts;


  /*  public void  agregarRol(Role rol){
        if (roles == null){
            roles = new LinkedList<Role>();
        }
        roles.add(rol);
    }

    public User() {
        this.roles= new ArrayList<>();
    }*/

}
