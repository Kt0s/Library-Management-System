package com.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.AuthorDAO;
import com.Models.Author;

@Controller
@RequestMapping("/Authors")
public class AuthorsController {

	@Autowired
	private AuthorDAO authorDAO;
	
	public boolean AddAuthor()
	{
		return true;
	}
	
	public boolean UpdateAuthor()
	{
		return true;
	}
	
	public boolean DeleteAuthor()
	{
		return true;
	}
	
	@RequestMapping("/authors")
	public ModelAndView listAuthors(@ModelAttribute("author") Author author)
	{
		return new ModelAndView("authors", "authorsList", authorDAO.getAllAuthors());
	}
	
}
