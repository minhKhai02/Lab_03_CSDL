package com.example._ChuMinhKhai_A6.repository;

import com.example._ChuMinhKhai_A6.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface IBookRepository extends JpaRepository<Book, Long> {
}
