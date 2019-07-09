package org.caucoder;

import lombok.Data;

/**
 * Student
 */
@Data
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private boolean active;
}