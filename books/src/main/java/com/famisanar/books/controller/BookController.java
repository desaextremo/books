package com.famisanar.books.controller;

import com.famisanar.books.dto.BookDto;
import com.famisanar.books.entity.Book;
import com.famisanar.books.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author desaextremo
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    
    @GetMapping("/{category}")
    private List<Book> getBooksByCategory(@PathVariable("category") Long category){
        List<Book> bookDtos=bookService.getBooksByCategory(category);
        return bookDtos;
    }
    @GetMapping("native/{category}")
    private List<BookDto> getBooksByCategoryNative(@PathVariable("category") Long category){
        return bookService.getBooksByCategoryNative(category);
    }
}
