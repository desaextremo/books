package com.famisanar.books.entity;

import java.time.LocalDate;
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
@Entity()
@Table(name = "lib_authors")
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AUT_ID")
    private Long id;

    @Column(name = "AUT_FIRST_NAME")
    private String firstName;
    @Column(name = "AUT_LAST_NAME")
    private String lastName;
    @Column(name = "AUT_DATE_DOB")
    private LocalDate birthDate;
    @Column(name = "AUT_GENDER")
    private  String gener;
    @Column(name = "AUT_CONTACT")
    private  String contactInfo;
    @Column(name = "AUT_OTHER_DETAILS")
    private String otherDetails;
}
