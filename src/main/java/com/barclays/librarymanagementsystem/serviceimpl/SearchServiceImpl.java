package com.barclays.librarymanagementsystem.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.barclays.librarymanagementsystem.model.LibDatabase;
import com.barclays.librarymanagementsystem.service.SearchService;
import com.barclays.librarymanagementsystem.vo.Book;

@Service
public class SearchServiceImpl implements SearchService {

	@Override
	public List<Book> searchBook(String bookNameStr) {
		return LibDatabase.getBookDB().stream().filter(book -> book.getName().contains(bookNameStr))
				.collect(Collectors.toList());
	}

}
