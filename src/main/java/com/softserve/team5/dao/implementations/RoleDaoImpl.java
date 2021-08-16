package com.softserve.team5.dao.implementations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.team5.dao.interfaces.RolesDao;
import com.softserve.team5.entity.Role;

@Repository
@Transactional
public class RoleDaoImpl implements RolesDao{

	
	private final SessionFactory sessionFactory;

	@Autowired
	public RoleDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void create(Role entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Role entity, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Role getById(Long id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Role.class, id);
	}

	@Override
	public List<Role> getAllEntities() {
		// TODO Auto-generated method stub
		return null;
	}

}
