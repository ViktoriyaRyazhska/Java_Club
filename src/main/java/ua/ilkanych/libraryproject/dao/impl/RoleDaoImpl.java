package ua.ilkanych.libraryproject.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.ilkanych.libraryproject.dao.RoleDao;
import ua.ilkanych.libraryproject.model.Role;

import java.util.List;

@Transactional
@Repository
public class RoleDaoImpl implements RoleDao {

    private final SessionFactory sessionFactory;

    public RoleDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Role getById(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Role.class, id);
    }

    @Override
    public List<Role> getAll() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select r from Role r", Role.class)
                .getResultList();
    }
}
