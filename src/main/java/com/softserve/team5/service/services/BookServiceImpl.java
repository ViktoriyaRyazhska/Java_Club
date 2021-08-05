package com.softserve.team5.service.services;

import com.softserve.team5.dao.interfaces.AuthorDao;
import com.softserve.team5.dao.interfaces.BookAuthorDao;
import com.softserve.team5.dao.interfaces.BookDao;
import com.softserve.team5.dto.BookDto;
import com.softserve.team5.entity.Author;
import com.softserve.team5.entity.Book;
import com.softserve.team5.entity.BookAuthor;
import com.softserve.team5.service.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
@EnableTransactionManagement
public class BookServiceImpl implements BookService {

    private final BookDao bookDao;
    private final AuthorDao authorDao;
    private final BookAuthorDao bookAuthorDao;

    @Autowired
    public BookServiceImpl(BookDao bookDao, AuthorDao authorDao, BookAuthorDao bookAuthorDao) {
        this.bookDao = bookDao;
        this.authorDao = authorDao;
        this.bookAuthorDao = bookAuthorDao;
    }

    @Override
    public void createFromDto(BookDto bookDto) {
        Book b = new Book(bookDto.getTitle(), bookDto.getCopies(), bookDto.getAverageReadingHours());
        bookDao.create(b);

        BookAuthor ba = new BookAuthor(authorDao.getById(bookDto.getAuthor_id()),
                bookDao.findByTitle(bookDto.getTitle()), true);
        bookAuthorDao.create(ba);
    }

    @Override
    public void create(Book entity) {
    }

    @Override
    public void update(Book book) {
        bookDao.update(book);
    }

    @Override
    public void delete(Long id) {
        bookDao.delete(id);
    }

    @Override
    public Book getById(Long id) {
        return bookDao.getById(id);
    }


    @Override
    public List<Book> getAllEntities() {
        return bookDao.getAllEntities();
    }

    @Override
    public boolean checkIsAvailable(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Book findByTitle(String title) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteSomeCopies(Long id, int quantity) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteOneCopy(Long id, int quantity) {
        // TODO Auto-generated method stub
    }

    @Override
    public Author getMainAuthorByBookId(Long bookId) {
        return bookDao.getMainAuthorByBookId(bookId);
    }

}
