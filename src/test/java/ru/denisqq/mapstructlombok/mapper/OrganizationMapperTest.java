package ru.denisqq.mapstructlombok.mapper;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import ru.denisqq.mapstructlombok.dto.EmployeeDto;
import ru.denisqq.mapstructlombok.dto.OrganizationDto;
import ru.denisqq.mapstructlombok.model.Employee;
import ru.denisqq.mapstructlombok.model.Organization;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class OrganizationMapperTest {

    private OrganizationMapper organizationMapper = Mappers.getMapper(OrganizationMapper.class);

    @Test
    void givenOrganization_thenShouldReturnMappedToOrganizationDto() {
        Organization organization = Organization.builder()
                .name("Test organization")
                .employees(
                        Collections.singletonList(
                                Employee.builder()
                                        .age(15)
                                        .name("Test employee")
                                        .build()
                        )
                )

                .build();

        OrganizationDto actualOrganizationDto = organizationMapper.toDto(organization);

        assertThat(actualOrganizationDto, notNullValue());
        assertThat(actualOrganizationDto.getName(), is("Test organization"));

        List<EmployeeDto> employees = actualOrganizationDto.getEmployees();
        assertThat(employees, hasSize(1));

        EmployeeDto employee = employees.get(0);
        assertThat(employee.getAge(), is(15));
        assertThat(employee.getName(), is("Test employee"));
    }
}