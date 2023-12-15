package com.example.elasticsearchdemo.service;

import com.example.elasticsearchdemo.model.Book;
import com.example.elasticsearchdemo.repository.BookRepository;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.tokens.Token;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Iterable<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book insertBook(Book book){
        return bookRepository.save(book);
    }

}
