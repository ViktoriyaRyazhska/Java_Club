package com.team3.dao.Impl;

import com.team3.dao.RoleDao;
import com.team3.entity.Role;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;

@Repository
public class RoleDaoImpl implements RoleDao {
    private final SessionFactory sessionFactory;

    public RoleDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Role getById(Long id) {
        Role role;
        try {
            role = sessionFactory.getCurrentSession().createQuery("from Role r  where r.id=:id", Role.class)
                    .setParameter("id", id)
                    .getSingleResult();
        } catch (NoResultException noResultException) {
            role = null;
        }
        return role;
    }
}