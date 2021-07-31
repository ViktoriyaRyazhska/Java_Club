package com.library.repository.impl;

import com.library.entity.RentInfo;
import com.library.entity.RentStatus;
import com.library.repository.RentInfoRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.library.entity.RentStatus.*;

@Transactional
@Repository
public class RentInfoRepositoryImpl implements RentInfoRepository {

    private final SessionFactory sessionFactory;

    public RentInfoRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public RentInfo save(RentInfo rentInfo) {
        Session session = sessionFactory.getCurrentSession();
        session.save(rentInfo);
        takeCopy(session, rentInfo.getBook().getId());
        return rentInfo;
    }

    @Override
    public RentInfo update(RentInfo rentInfo) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(rentInfo);

        if (rentInfo.getRentStatus() == CANCELED || rentInfo.getRentStatus() == RETURNED) {
            returnCopy(session, rentInfo.getBook().getId());
        }

        return rentInfo;
    }


    @Transactional(readOnly = true)
    @Override
    public RentInfo findById(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(RentInfo.class, id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<RentInfo> findAll() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select r from RentInfo r", RentInfo.class)
                .getResultList();
    }

    @Override
    public List<RentInfo> findByRentStatus(RentStatus rentStatus) {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select r from RentInfo r where r.rentStatus=:rentStatus", RentInfo.class)
                .setParameter("rentStatus", rentStatus)
                .getResultList();
    }

    @Override
    public RentInfo remove(Long id) {
        Session session = sessionFactory.getCurrentSession();

        RentInfo rentInfo = findById(id);

        session.remove(rentInfo);

        return rentInfo;
    }

    @Transactional(readOnly = true)
    @Override
    public List<RentInfo> findByUserId(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select r from RentInfo r where r.user.id=:id", RentInfo.class)
                .setParameter("id", id)
                .getResultList();
    }


    private void takeCopy(Session session, Long id) {
        session.createQuery("update Book b set b.copies = b.copies - 1 where b.id=:id")
                .setParameter("id", id)
                .executeUpdate();
    }

    private void returnCopy(Session session, Long id) {
        session.createQuery("update Book b set b.copies = b.copies + 1 where b.id=:id")
                .setParameter("id", id)
                .executeUpdate();
    }
}
