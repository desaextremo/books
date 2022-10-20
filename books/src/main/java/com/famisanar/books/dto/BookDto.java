package com.famisanar.books.dto;

import lombok.Builder;
import lombok.Data;

/**
 *
 * @author desaextremo
 */
@Data
@Builder
public class BookDto {
    private String title;
    private String author;
    private String isbn;
    private double price;
    private String category;
    private String description;
}
