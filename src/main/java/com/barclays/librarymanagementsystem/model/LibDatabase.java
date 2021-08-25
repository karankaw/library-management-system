package com.barclays.librarymanagementsystem.model;

import java.util.ArrayList;
import java.util.List;

import com.barclays.librarymanagementsystem.vo.Book;

public class LibDatabase {
	
	
	private static List<Book> bookDB = new ArrayList<Book>();

	public static List<Book> getBookDB() {
		return bookDB;
	}

}
