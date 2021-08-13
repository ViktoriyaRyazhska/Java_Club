package com.team3.dao.Impl;

import com.team3.dao.UserDao;
import com.team3.entity.Role;
import com.team3.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private final SessionFactory sessionFactory;

    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addUser(User user) {
        this.sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public User getUserById(Long id) {return sessionFactory.getCurrentSession().get(User.class, id);}

    @Override
    public List<User> getAllUsers() {
        return sessionFactory.getCurrentSession().createQuery("select a from User a",User.class).getResultList();
    }

    @Override
    public Role getRoleByName(String name) {
        Role role;
        try {
            role = (Role) sessionFactory.getCurrentSession().createQuery("from Role r where r.name = :name")
                    .setParameter("name", name)
                    .getSingleResult();
        } catch (NoResultException e) {
            role = null;
        }
        return role;
    }
    @Override
    public Role getRoleById(Long id) {
        Role role;
        try {
            role = (Role) sessionFactory.getCurrentSession().createQuery("from Role r where r.id = :id")
                    .setParameter("id", id)
                    .getSingleResult();
        } catch (NoResultException e) {
            role = null;
        }
        return role;
    }

    @Override
    public void setRole(String name) {
      //  sessionFactory.getCurrentSession().createQuery("INSERT INTO users_roles(user_id,role_id) VALUES ('') ")
    }
}