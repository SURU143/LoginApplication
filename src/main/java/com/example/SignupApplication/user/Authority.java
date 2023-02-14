package com.example.demo.user;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Table(name = "AUTH_AUTHORITY")
@Entity
public class Authority implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Column(name = "ROLE_CODE")
    private String roleCode;

    @Column(name = "ROLE_DESCRIPTION")
    private String roleDescription;

    @Override
    public String getAuthority() {
        return null;
    }
}
