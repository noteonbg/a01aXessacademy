package a06pagination.controller;



import a06pagination.model.Book;
import a06pagination.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepo;

    //GET /books?page=0&size=3
    //GET /books/genre?genre=Sci-Fi&page=1&size=2
    @GetMapping
    public Page<Book> getBooks(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return bookRepo.findAll(pageable);
    }

    // Optional: get books by genre with pagination
    @GetMapping("/genre")
    public Page<Book> getBooksByGenre(
            @RequestParam String genre,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "2") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        return bookRepo.findByGenre(genre, pageable);
    }
}


/*
Pageable pageable = PageRequest.of(0, 5);
Page 0 (first page)

With 5 records per page

Default sort by ID ascending

Pageable pageable = PageRequest.of(0, 5, Sort.by("title").descending());

SELECT * FROM book ORDER BY id ASC LIMIT 5 OFFSET 0;
 */