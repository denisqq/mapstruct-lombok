package ru.denisqq.mapstructlombok.model;


import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Employee {
    String name;
    Integer age;
}
