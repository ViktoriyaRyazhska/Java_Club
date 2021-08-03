package com.softserve.team5.dao.interfaces;

import java.util.List;

/**
 * Determines default operations for some entities
 * 
 * @author Roman Klymus
 *
 * @param <T> Set type for operations
 */
public interface DefaultDaoOpearations<T> {
	void create(T entity);

	void update(T entity);

	void delete(Long id);

	T getById(Long id);

	List<T> getAllEntities();
}
