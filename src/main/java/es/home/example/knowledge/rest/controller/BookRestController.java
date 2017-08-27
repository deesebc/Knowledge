package es.home.example.knowledge.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.home.example.knowledge.entity.Book;
import es.home.example.knowledge.repository.BookDao;

@RestController("/book")
public class BookRestController {
	@Autowired
	private BookDao repository;

	@GetMapping
	public List<Book> findAll() {
		return repository.findAll();
	}

	@GetMapping("/{id}")
	public Book findById(@PathVariable("id") final Integer id) {
		return repository.findOne(id);
	}
}
