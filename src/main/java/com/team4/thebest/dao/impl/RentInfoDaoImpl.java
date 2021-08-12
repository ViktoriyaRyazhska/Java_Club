package com.team4.thebest.dao.impl;

import com.team4.thebest.dao.RentInfoDao;
import com.team4.thebest.models.RentInfo;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class RentInfoDaoImpl implements RentInfoDao {

    private final SessionFactory sessionFactory;

    @Override
    public RentInfo findById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(RentInfo.class, id);
    }

    @Override
    public void save(RentInfo rentInfo) {
        Session session = sessionFactory.getCurrentSession();
        session.save(rentInfo);
        takeCopy(session, rentInfo.getBook().getId());
    }

    private void takeCopy(Session session, Long id) {
        session.createQuery("update Book b set b.copies = b.copies - 1 where b.id=:id")
                .setParameter("id", id)
                .executeUpdate();
    }
}
