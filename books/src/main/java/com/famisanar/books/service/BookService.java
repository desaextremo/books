package com.famisanar.books.service;

import com.famisanar.books.dto.BookDto;
import com.famisanar.books.entity.Book;
import com.famisanar.books.repository.BookRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author desaextremo
 */
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooksByCategory(Long categoryId) {
        return bookRepository.findByCategory(categoryId);
    }

    public List<BookDto> getBooksByCategoryNative(Long categoryId) {
        BookDto bookDto = null; 
        List<Object[]> listaObject = bookRepository.findByCategoryNative(categoryId);
        List<BookDto> listaDto = new ArrayList<BookDto>();
        
        for (Object[] object : listaObject) {
            bookDto = BookDto.builder().category((String)object[0])
                             .title((String) object[1])
                             .price((Double) object[2])
                             .author((String)object[3])
                             .isbn((String) object[4])
                             .description((String) object[5])
                             .build();
                   
            
            listaDto.add(bookDto);
                    
            System.out.println("dat:" + object);    
        }

        return listaDto;
    }
}
