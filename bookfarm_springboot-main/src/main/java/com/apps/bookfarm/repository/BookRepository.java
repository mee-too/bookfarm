package com.apps.bookfarm.repository;

import com.apps.bookfarm.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
}
