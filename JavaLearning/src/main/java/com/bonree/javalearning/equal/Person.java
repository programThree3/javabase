package com.bonree.javalearning.equal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private String name;

    private int age;
}
