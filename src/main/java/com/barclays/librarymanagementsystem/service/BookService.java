package com.barclays.librarymanagementsystem.service;

import java.util.List;

import com.barclays.librarymanagementsystem.vo.Book;

public interface BookService {

	public abstract void addBook(Book book);
	
	public abstract List<Book> fetchAllBooks();
	
}
