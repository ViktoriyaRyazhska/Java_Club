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

    @Override
    public void deleteRentByBookId(Long userId) {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete from RentInfo where book.id=:userId")
                .setParameter("userId", userId)
                .executeUpdate();
    }

    @Override
    public void deleteRentByUserId(Long userId) {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete from RentInfo where user.id=:userId")
                .setParameter("userId", userId)
                .executeUpdate();
    }

    @Override
    public void update(RentInfo rentInfo) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(rentInfo);
        returnCopy(session, rentInfo.getBook().getId());
    }

    @Override
    public RentInfo findByBookIdAndUserId(Long bookId, Long userId) {
        Session session = sessionFactory.getCurrentSession();

        Long countOfNotReturnedBookWithSpecifiedBookIdAndUserId = session.createQuery("select count(r) from RentInfo r " +
                        "where r.book.id=:bookId and r.user.id=:userId and r.returnDate is null", Long.class)
                .setParameter("bookId", bookId)
                .setParameter("userId", userId)
                .getSingleResult();

        if (countOfNotReturnedBookWithSpecifiedBookIdAndUserId >= 1) {
            return session.createQuery("select r from RentInfo r where r.book.id=:bookId and r.user.id=:userId and " +
                            "r.id=(select min(rent.id) from RentInfo rent where rent.book.id=:bookId and " +
                            "rent.user.id=:userId and rent.returnDate is null)", RentInfo.class)
                    .setParameter("bookId", bookId)
                    .setParameter("userId", userId)
                    .getSingleResult();
        }

        return null;
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
