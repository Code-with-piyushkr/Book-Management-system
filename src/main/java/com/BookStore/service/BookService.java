package com.BookStore.service;

import com.BookStore.entity.Book;
import com.BookStore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bRepo;
    public void save(Book b){
       bRepo.save(b);
    }

    public List<Book> getAllBook() {
        return bRepo.findAll();
   }
   public Book getBookById(int id){
        return bRepo.findById(id).get();
   }
   public void deleteByID(int id){
        bRepo.deleteById(id);
   }
}