package com.famisanar.books.repository;

import com.famisanar.books.entity.Book;
import com.famisanar.books.entity.Category;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author desaextremo
 */
public interface BookRepository extends JpaRepository<Book, Long> {
    
    
    List<Book> findByCategory(Category category);

    @Query(value = "select  B from Book B WHERE B.category.id=:id order by B.author.firstName,B.author.lastName,B.title")
    List<Book> findByCategoryJpql(Long id);

    @Query(value = "SELECT CAT_DESCRIPCION,\n"
            + "	   BOOK_TITLE,\n"
            + "       BOOK_PRICE,\n"
            + "       CONCAT(AUT_FIRST_NAME,' ',AUT_LAST_NAME) AS AUTOR,\n"
            + "       BOOK_ISBN,\n"
            + "       BOOK_DESCRIPCION\n"
            + "FROM lib_books,lib_book_categories,lib_authors\n"
            + "WHERE BOOK_AUT_ID = AUT_ID\n"
            + "  and BOOK_CAT_ID =  CAT_ID\n"
            + "  and BOOK_CAT_ID=:id\n"
            + "ORDER BY BOOK_TITLE", nativeQuery = true)
    List<Object[]> findByCategoryNative(Long id);
}
