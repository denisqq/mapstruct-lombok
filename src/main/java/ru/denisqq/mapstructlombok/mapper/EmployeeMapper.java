package ru.denisqq.mapstructlombok.mapper;

import org.mapstruct.Mapper;
import ru.denisqq.mapstructlombok.dto.EmployeeDto;
import ru.denisqq.mapstructlombok.model.Employee;

@Mapper
public interface EmployeeMapper extends DtoMapper<Employee, EmployeeDto> {

}
