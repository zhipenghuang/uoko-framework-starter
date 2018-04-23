package com.uoko.framework.uokoframeworkstarter.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {
    private String name;

    private String password;

    private String phone;

}