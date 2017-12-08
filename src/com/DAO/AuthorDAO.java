package com.DAO;

import java.util.List;

import com.Models.Author;

public interface AuthorDAO {
	
	public void saveAuthor(Author author);
	public Author getAuthorById(int id);
	public void updateAuthor(Author author);
	public void deleteAuthor(int id);
	public List<Author> getAllAuthors();
}
