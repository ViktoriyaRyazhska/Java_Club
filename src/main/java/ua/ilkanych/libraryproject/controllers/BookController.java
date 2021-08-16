package ua.ilkanych.libraryproject.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.ilkanych.libraryproject.model.Author;
import ua.ilkanych.libraryproject.model.Book;
import ua.ilkanych.libraryproject.service.AuthorService;
import ua.ilkanych.libraryproject.service.BookService;
import ua.ilkanych.libraryproject.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BookController {

    private final BookService bookService;
    private final AuthorService authorService;

    public BookController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @GetMapping("/book/create")
    public String create(Model model){
        Book book = new Book();
        List<Author> authors = authorService.getAll();
        model.addAttribute("book", book);
        model.addAttribute("authors", authors);

        return "/book/addBook";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @PostMapping("/create")
    public String create(@ModelAttribute Book book, @RequestParam(name = "id") Long Id){

        book.setAuthor(authorService.getById(Id));
        bookService.create(book);

        return "redirect:/book/" + book.getId();
    }


    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @GetMapping("/book/{id}/add")
    public String addCoAuthor(@PathVariable Long id, @RequestParam(name = "co_id") Long c_id) {
        Book book = bookService.getBookAuthors(id);

        book.getAuthors().add(authorService.getById(c_id));
        bookService.create(book);

        return "redirect:/book/" + id;
    }

    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @GetMapping("book/{id}/delete")
    public String delete(@PathVariable Long id, Model model){
        bookService.delete(id);
        model.addAttribute("allBooks", bookService.getAll());
        return "book/allBook";
    }

    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @GetMapping("book/{id}/edit")
    public String update(@PathVariable Long id, Model model){
        model.addAttribute("book", bookService.getById(id));
        model.addAttribute("authors", authorService.getAll());
        return "book/edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute Book book, @RequestParam(name = "aid") Long id){
        Book book1 = bookService.getBookAuthors(id);
        book.setAuthor(authorService.getById(id));
        book.getAuthors().addAll(book1.getAuthors());

        bookService.create(book);

        return "redirect:/book/" + book.getId();
    }

    @GetMapping("/getAllBooks")
    public String getAllBooks(Model model){
        model.addAttribute("allBooks", bookService.getAll());
        return "book/allBook";
    }

    @GetMapping("/findBookByTitle")
    public String findByTitle(@RequestParam ("findBookByTitle") String title, Model model){
        Book bookByTitle = bookService.getByTitle(title);

        model.addAttribute("bookByTitle", bookByTitle);
        return "redirect:/book/" + bookByTitle.getId();
    }

    @GetMapping("/book/{id}")
    public String getSelectedBook(@PathVariable Long id, Model model){
        Book bookAuthors = bookService.getBookAuthors(id);
        List<Author> authors = getAllAuthors(bookAuthors);

        model.addAttribute("book", bookService.getById(id));
        model.addAttribute("bookAuthors", bookAuthors);
        model.addAttribute("coAuthors", authors);
        return "book/selectedBook";
    }

    @GetMapping("/index")
    public String getMostPopularBook(Model model){

        model.addAttribute("books",bookService.getMostPopularBooksForWeek());

        return "index";
    }


    @GetMapping("/login")
    public String getLoginForm() {
        if (!SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString().equals("anonymousUser")) {
            return "redirect:/";
        }
        return "login";
    }

    private List<Author> getAllAuthors(Book book) {
        return authorService.getAll().stream()
                .filter(author -> !(book.getAuthors().contains(author)))
                .filter(author -> !book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }
}
