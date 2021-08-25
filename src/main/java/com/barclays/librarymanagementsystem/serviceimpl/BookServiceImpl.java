package com.barclays.librarymanagementsystem.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.barclays.librarymanagementsystem.model.LibDatabase;
import com.barclays.librarymanagementsystem.service.BookService;
import com.barclays.librarymanagementsystem.vo.Book;

@Service
public class BookServiceImpl implements BookService {

	/**
	 * MVP Implemetation - bare miniumum, No Validation, Will even allow duplicates
	 */
	@Override
	public void addBook(Book book) {
		LibDatabase.getBookDB().add(book);
	}

	@Override
	public List<Book> fetchAllBooks() {
		
		return LibDatabase.getBookDB();
	}

}
