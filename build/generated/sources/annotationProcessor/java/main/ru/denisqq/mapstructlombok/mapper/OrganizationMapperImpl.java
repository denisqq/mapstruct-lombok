package ru.denisqq.mapstructlombok.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;
import ru.denisqq.mapstructlombok.dto.OrganizationDto;
import ru.denisqq.mapstructlombok.dto.OrganizationDto.OrganizationDtoBuilder;
import ru.denisqq.mapstructlombok.model.Organization;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-24T01:09:51+0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_265 (Private Build)"
)
public class OrganizationMapperImpl implements OrganizationMapper {

    private final EmployeeMapper employeeMapper = Mappers.getMapper( EmployeeMapper.class );

    @Override
    public OrganizationDto toDto(Organization entity) {
        if ( entity == null ) {
            return null;
        }

        OrganizationDtoBuilder organizationDto = OrganizationDto.builder();

        organizationDto.name( entity.getName() );
        organizationDto.employees( employeeMapper.toDto( entity.getEmployees() ) );

        return organizationDto.build();
    }

    @Override
    public List<OrganizationDto> toDto(Collection<Organization> entities) {
        if ( entities == null ) {
            return null;
        }

        List<OrganizationDto> list = new ArrayList<OrganizationDto>( entities.size() );
        for ( Organization organization : entities ) {
            list.add( toDto( organization ) );
        }

        return list;
    }
}
