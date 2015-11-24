package com.test;

public interface IListMapper<E,D> {
    E asEntity(D dto);

    D asDto(E entity);
}
