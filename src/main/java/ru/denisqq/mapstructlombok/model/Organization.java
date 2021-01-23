package ru.denisqq.mapstructlombok.model;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class Organization {
     String name;
     List<Employee> employees;
}
