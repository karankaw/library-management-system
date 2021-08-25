package com.barclays.librarymanagementsystem.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.librarymanagementsystem.service.BookService;
import com.barclays.librarymanagementsystem.service.SearchService;
import com.barclays.librarymanagementsystem.vo.Book;

@RestController
@RequestMapping("/libmgmtsys")
public class BookController {

	private static final String HEALTH_CHECK_MSG = "Library Management System API - HealthCheck OK";

	private static final Logger LOGGER = LoggerFactory.getLogger(BookController.class);

	@Autowired
	private BookService bookservice;

	@Autowired
	private SearchService searchservice;

	@PostMapping("/addNewBook")
	public void addInputData(@RequestBody Book inputBook) {
		bookservice.addBook(inputBook);
		LOGGER.info("Book {} Added Sucessfully!", inputBook.getName());
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/fectchAllBooks")
	public List<Book> fetchAllBooks() {
		return bookservice.fetchAllBooks();
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/searchBookByName")
	public List<Book> findBookByName(@RequestParam("bookName") String bookName) {
		return searchservice.searchBook(bookName);
	}

	// Welcome Page, Can also act as Health Check URL for ELB
	@GetMapping("")
	public String defaultWelcomePage() {

		LOGGER.info(HEALTH_CHECK_MSG);
		return HEALTH_CHECK_MSG;
	}
}
