package ru.denisqq.mapstructlombok.mapper;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import ru.denisqq.mapstructlombok.dto.EmployeeDto;
import ru.denisqq.mapstructlombok.model.Employee;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class EmployeeMapperTest {

    private EmployeeMapper employeeMapper = Mappers.getMapper(EmployeeMapper.class);

    @Test
    void givenEmployee_thenShouldReturnMappedEmployeeToDto() {

        Employee employee = Employee.builder()
                .name("Test employee")
                .age(78)
                .build();

        EmployeeDto actualEmployeeDto = employeeMapper.toDto(employee);

        assertThat(actualEmployeeDto.getName(), is("Test employee"));
        assertThat(actualEmployeeDto.getAge(), is(78));
    }
}