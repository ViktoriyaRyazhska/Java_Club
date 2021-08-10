package com.softserve.team5.dao.implementations;

import com.softserve.team5.dao.interfaces.JournalDao;
import com.softserve.team5.entity.Book;
import com.softserve.team5.entity.Journal;
import com.softserve.team5.entity.JournalStatus;
import com.softserve.team5.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@Repository
@EnableTransactionManagement
@Transactional
public class JournalDaoImpl implements JournalDao {

	private final SessionFactory sessionFactory;

	@Autowired
	public JournalDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Journal getById(Long id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Journal.class, id);
	}

	@Override
	public void addRequest(User user, Book book) {
		Session session = sessionFactory.getCurrentSession();
		Journal request = new Journal();
		request.setBookID(book);
		request.setUserID(user);
		request.setStatus(JournalStatus.REQUESTED);
		session.persist(request);
	}

	@Override
	public void giveBook(Long id) {
		Session session = sessionFactory.getCurrentSession();
		Journal toBeUpdated = getById(id);
		toBeUpdated.setStatus(JournalStatus.GIVEN);
		toBeUpdated.setRentDate(LocalDate.now());
		toBeUpdated.setExpectedReturnDate(LocalDate.now().plusDays(14));
		session.update(toBeUpdated);
	}

	@Override
	public void returnBook(Long id) {
		Session session = sessionFactory.getCurrentSession();
		Journal toBeUpdated = getById(id);
		toBeUpdated.setStatus(JournalStatus.RETURNED);
		toBeUpdated.setBookReturnDate(LocalDate.now());
		session.update(toBeUpdated);
	}
	

	@Override
	public List<Journal> getAllRequests() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Journal").getResultList();
	}

	@Override
	public List<Book> getMostPopularBooks(LocalDate periodStart, LocalDate periodEnd) {
		
		return null;
	}
	//work in progress
	public List<Map<Book, Integer>> bookInSelectedPeriod(LocalDate periodStart, LocalDate periodEnd) {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Map<Book, Integer>> list = session.createQuery(
				"select new map(b, count(b)) from Book b inner join Journal j on b.id=j.bookID.id where j.rentDate between :stDate and :enDate group by b.title")
				.setParameter("stDate", periodStart.format(DateTimeFormatter.ISO_DATE))
				.setParameter("enDate", periodEnd.format(DateTimeFormatter.ISO_DATE)).getResultList();
		return list;
	}

	@Override
	public List<Book> getMostUnPopularBooks(LocalDate periodStart, LocalDate periodEnd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBooksByUser(Long userId, JournalStatus status) {
		Session session = sessionFactory.getCurrentSession();
		try {
			return session.createQuery(
					"select b from Book b inner join Journal j on b.id = j.bookID.id where j.userID.id = :user_id and j.status= :status"
					, Book.class)
					.setParameter("user_id", userId)
					.setParameter("status", status)
					.getResultList();
		} catch (NoResultException ex) {
			return null;
		}
	}


	@Override
	public double averengeNumberOfRequestsInPeriod(LocalDate start, LocalDate end) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> usersWhoDidNoReturnBookOnTime() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
