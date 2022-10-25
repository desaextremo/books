package com.famisanar.books.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author desaextremo
 */
@Entity
@Table (name = "LIB_BOOKS")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOK_ID")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "BOOK_AUT_ID", nullable = false, updatable = false,referencedColumnName = "AUT_ID")
    private Author author;
    @ManyToOne
    @JoinColumn(name = "BOOK_CAT_ID", nullable = false, updatable = false,referencedColumnName = "CAT_ID")
    private Category category;
    @Column(name = "BOOK_ISBN")
    private String isbn;
    @Column(name = "BOOK_PUBLISHED_DATE")
    private LocalDate published;
    @Column(name = "BOOK_TITLE")
    private String title;
    @Column(name = "BOOK_DESCRIPCION")
    private String descripcion;
    @Column(name = "BOOK_PRICE")
    private double price;
    @Column(name = "BOOK_MIMETYPE")
    private  String mimetype;
    @Column(name = "BOOK_FILENAME")
    private  String filename;
    @Column(name = "BOOK_IMAGE_LAST_UPDATE")
    private  LocalDate last_update;
}
