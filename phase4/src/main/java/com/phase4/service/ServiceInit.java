package com.phase4.service;

import java.util.List;

public interface ServiceInit<T> {

    List<T> getAll();

    void save(T t);

    void update(Long id,T t);

    void delete(Long id);

    T getById(Long id);
}
