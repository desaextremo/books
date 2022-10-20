package com.famisanar.books.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author desaextremo
 */
@Entity
@Table(name = "LIB_BOOK_CATEGORIES")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CAT_ID")
    private Long id;
    @Column(name = "CAT_DESCRIPCION")
    private String description;
}
