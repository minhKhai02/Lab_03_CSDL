package com.example._ChuMinhKhai_A6.repository;

import com.example._ChuMinhKhai_A6.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
    @Query("SELECT b FROM Book b WHERE LOWER(b.title) LIKE %:keyword% OR LOWER(b.category.name) LIKE %:keyword%")
    List<Book> searchBooks(@Param("keyword") String keyword);

}
