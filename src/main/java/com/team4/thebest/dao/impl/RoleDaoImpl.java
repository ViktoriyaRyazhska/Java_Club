package com.team4.thebest.dao.impl;

import com.team4.thebest.dao.RoleDao;
import com.team4.thebest.models.Role;
import com.team4.thebest.models.RoleType;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class RoleDaoImpl implements RoleDao {

    private final SessionFactory sessionFactory;

    @Override
    public Role findById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Role.class, id);
    }

    @Override
    public Role getByRoleType(RoleType roleType) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select r from Role r where r.roleType=:roleType", Role.class)
                .setParameter("roleType", roleType)
                .getSingleResult();
    }
}
