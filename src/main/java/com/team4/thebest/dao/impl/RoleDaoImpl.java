package com.team4.thebest.dao.impl;

import com.team4.thebest.dao.RoleDao;
import com.team4.thebest.models.Role;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
@AllArgsConstructor
public class RoleDaoImpl implements RoleDao {

    private final SessionFactory sessionFactory;

    @Override
    public List<Role> list() {
        final Session session = sessionFactory.getCurrentSession();

        @SuppressWarnings("unchecked")
        final TypedQuery<Role> query = session.createQuery("from Role");
        return query.getResultList();
    }
}
