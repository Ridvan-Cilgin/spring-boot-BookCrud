package com.ridvancilgin.springbootbookcrud.repository;


import com.ridvancilgin.springbootbookcrud.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
