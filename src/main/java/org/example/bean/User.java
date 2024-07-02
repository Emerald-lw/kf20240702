package org.example.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 2589914115395182823L;
    private Integer id;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String address;
    private String sex;
}
