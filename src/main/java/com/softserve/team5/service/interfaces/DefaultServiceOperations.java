package com.softserve.team5.service.interfaces;

import java.util.List;

public interface DefaultServiceOperations<T> {
	void create(T entity);

	void update(T entity);

	void delete(Long id);

	T getById(Long id);

	List<T> getAllEntities();
}
