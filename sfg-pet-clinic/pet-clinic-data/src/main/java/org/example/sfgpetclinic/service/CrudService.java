package org.example.sfgpetclinic.service;

import java.util.Set;

/**
 * Create by Kush on 31-03-2021
 */
public interface CrudService<T,ID>{

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
