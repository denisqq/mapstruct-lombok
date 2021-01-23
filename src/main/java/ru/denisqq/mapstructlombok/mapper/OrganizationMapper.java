package ru.denisqq.mapstructlombok.mapper;

import org.mapstruct.Mapper;
import ru.denisqq.mapstructlombok.dto.OrganizationDto;
import ru.denisqq.mapstructlombok.model.Organization;

@Mapper(uses = EmployeeMapper.class)
public interface OrganizationMapper extends DtoMapper<Organization, OrganizationDto> {


}
