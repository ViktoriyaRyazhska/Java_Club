package com.library.controller;

import com.library.entity.Author;
import com.library.entity.Book;
import com.library.service.AuthorService;
import com.library.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class BookController {

    private final BookService bookService;
    private final AuthorService authorService;

    public BookController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @GetMapping("/save")
    public String save(Model model) {
        Book book = new Book();
        List<Author> authors = authorService.findAll();

        model.addAttribute("book", book);
        model.addAttribute("authors", authors);

        return "book-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Book book, @RequestParam(name = "author_id") Long id) {

        book.setMainAuthor(authorService.findById(id));

        bookService.save(book);

        return "redirect:/" + book.getId();
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model) {

        Book book = bookService.findById(id);
        List<Author> authors = authorService.findAll();

        model.addAttribute("book", book);
        model.addAttribute("authors", authors);

        return "book-update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Book book, @RequestParam(name = "author_id") Long id) {
        Book oldBook = bookService.findByIdFetchCoAuthors(id);

        book.setMainAuthor(authorService.findById(id));
        book.getCo_authors().addAll(oldBook.getCo_authors());

        bookService.save(book);

        return "redirect:/" + book.getId();
    }

    @GetMapping("/{id}/add")
    public String addCoAuthor(@PathVariable Long id, @RequestParam(name = "author_id") Long author_id) {
        Book book = bookService.findByIdFetchCoAuthors(id);

        book.getCo_authors().add(authorService.findById(author_id));

        bookService.save(book);

        return "redirect:/" + id;
    }

    @GetMapping("/{id}/remove")
    public String removeCoAuthor(@PathVariable Long id, @RequestParam(name = "author_id") Long author_id) {
        Book book = bookService.findByIdFetchCoAuthors(id);

        book.getCo_authors().remove(authorService.findById(author_id));

        bookService.save(book);

        return "redirect:/" + id;
    }

    @GetMapping("/{id}")
    public String read(@PathVariable Long id, Model model) {
        Book book = bookService.findByIdFetchCoAuthors(id);
        List<Author> areNotCoAuthors = findAllNotCoAuthor(book);
        Optional<Double> averageTimeOfReadingBook = bookService.averageTimeOfReadingBook(book.getTitle());

        model.addAttribute("book", book);
        model.addAttribute("areNotCoAuthors", areNotCoAuthors);
        model.addAttribute("averageTimeOfReadingBook", averageTimeOfReadingBook.orElse((double) 0));

        return "book-info";
    }


    @GetMapping("/findBook")
    public String findBook(@RequestParam("findBook") String str, Model model) {
        Optional<List<Book>> booksByAuthorOrTitle = bookService.findBooksByAuthorOrTitle(str);

        booksByAuthorOrTitle.ifPresent(books -> model.addAttribute("books", books));

        return "book-list";
    }

    @PostMapping("/mostPopular")
    public String findMostPopular(Model model, @RequestParam String from,
                                  @RequestParam String to) {


        List<Book> mostPopularBooks = bookService.findMostPopularBooks(
                LocalDate.parse(from).atTime(0,0,0),
                LocalDate.parse(to).atTime(23,59,59)
        );


        model.addAttribute("books", mostPopularBooks);

        return "book-list";
    }

    @PostMapping("/mostUnpopular")
    public String findMostUnpopular(Model model, @RequestParam String from,
                                  @RequestParam String to) {


        List<Book> mostPopularBooks = bookService.findMostUnpopularBooks(
                LocalDate.parse(from).atTime(0,0,0),
                LocalDate.parse(to).atTime(23,59,59)
        );

        model.addAttribute("books", mostPopularBooks);

        return "book-list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        bookService.remove(id);
        return "redirect:/";
    }

    @GetMapping
    public String getAll(Model model) {
        List<Book> books = bookService.findAll();
        model.addAttribute("books", books);
        return "book-list";
    }

    private List<Author> findAllNotCoAuthor(Book book) {
        return authorService.findAll().stream()
                .filter(author -> !(book.getCo_authors().contains(author)))
                .filter(author -> !book.getMainAuthor().equals(author))
                .collect(Collectors.toList());
    }
}
