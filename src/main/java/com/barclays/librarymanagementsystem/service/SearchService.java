package com.barclays.librarymanagementsystem.service;

import java.util.List;

import com.barclays.librarymanagementsystem.vo.Book;

public interface SearchService {
	
	public abstract List<Book> searchBook(String bookNameStr);

}
