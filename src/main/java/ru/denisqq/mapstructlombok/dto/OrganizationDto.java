package ru.denisqq.mapstructlombok.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class OrganizationDto {
    String name;
    List<EmployeeDto> employees;
}
