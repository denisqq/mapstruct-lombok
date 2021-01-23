package ru.denisqq.mapstructlombok.mapper;

import java.util.Collection;
import java.util.List;

public interface DtoMapper<E, D> {
    D toDto(E entity);
    List<D> toDto(Collection<E> entities);
}
