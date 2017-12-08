package com.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.DAO.AuthorDAO;
import com.Models.Author;

public class AuthorDAOImpl implements AuthorDAO{

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void saveAuthor(Author author) {
		String sql = "insert into Authors values (null,?,?)";
		
		jdbcTemplate.update(sql, new Object[] {author.getFirstName(), author.getLastName()});
		
	}

	@Override
	public Author getAuthorById(int id) {
		String sql = "select * from Authors where id=?";
		
		Author author = (Author) jdbcTemplate.queryForObject(sql, new Object[] {id}, (rs, rowNum) -> {
			Author authorDBRow = new Author();
			authorDBRow.setId(rs.getInt(1));
			authorDBRow.setFirstName(rs.getString(2));
			authorDBRow.setLastName(rs.getString(3));
			return authorDBRow;
		});
		
		return author;
	}

	@Override
	public void updateAuthor(Author author) {
		String sql = "update Authors set firstName=?, lastName=? where id=?";
		
		jdbcTemplate.update(sql, new Object[] {author.getFirstName(), author.getLastName(), author.getId()});
		
	}

	@Override
	public void deleteAuthor(int id) {
		String sql = "delete from Authors where id=?";
		
		jdbcTemplate.update(sql, new Object[] {id});
		
	}

	@Override
	public List<Author> getAllAuthors() {
		String sql = "select * from Authors";
		
		List<Author> authorList = jdbcTemplate.query(sql, (ResultSetExtractor<List<Author>>) rs -> {
			List<Author> list = new ArrayList<Author>();
			while(rs.next())
			{
				Author author = new Author();
				author.setId(rs.getInt(1));
				author.setFirstName(rs.getString(2));
				author.setLastName(rs.getString(3));
				list.add(author);
			}
			return list;
		});
		
		return authorList;
	}

}
