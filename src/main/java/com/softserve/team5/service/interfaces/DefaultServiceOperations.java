package com.softserve.team5.service.interfaces;

public interface DefaultServiceOperations<T> {
	void create(T entity);

	void update(T entity);

	void delete(Long id);

	T getById(Long id);
}
