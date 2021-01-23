package ru.denisqq.mapstructlombok.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import ru.denisqq.mapstructlombok.dto.EmployeeDto;
import ru.denisqq.mapstructlombok.dto.EmployeeDto.EmployeeDtoBuilder;
import ru.denisqq.mapstructlombok.model.Employee;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-24T01:09:51+0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_265 (Private Build)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDto toDto(Employee entity) {
        if ( entity == null ) {
            return null;
        }

        EmployeeDtoBuilder employeeDto = EmployeeDto.builder();

        employeeDto.name( entity.getName() );
        employeeDto.age( entity.getAge() );

        return employeeDto.build();
    }

    @Override
    public List<EmployeeDto> toDto(Collection<Employee> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EmployeeDto> list = new ArrayList<EmployeeDto>( entities.size() );
        for ( Employee employee : entities ) {
            list.add( toDto( employee ) );
        }

        return list;
    }
}
