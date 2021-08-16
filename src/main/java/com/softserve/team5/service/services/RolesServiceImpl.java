package com.softserve.team5.service.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.team5.dao.interfaces.RolesDao;
import com.softserve.team5.entity.Role;
import com.softserve.team5.service.interfaces.RolesService;

@Service
@Transactional
public class RolesServiceImpl implements RolesService{

	
	private RolesDao rolesDao;
	
	public RolesServiceImpl(RolesDao roleDao) {
		this.rolesDao = roleDao;
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
		return rolesDao.getById(id);
	}

	@Override
	public List<Role> getAllEntities() {
		// TODO Auto-generated method stub
		return null;
	}

}
