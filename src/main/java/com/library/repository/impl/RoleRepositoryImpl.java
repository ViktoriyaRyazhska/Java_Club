package com.library.repository.impl;

import com.library.entity.Role;
import com.library.repository.RoleRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class RoleRepositoryImpl implements RoleRepository {

    private final SessionFactory sessionFactory;

    public RoleRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional(readOnly = true)
    @Override
    public Role findById(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Role.class, id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Role> findAll() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select r from Role r", Role.class)
                .getResultList();
    }


}
