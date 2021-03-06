package com.Models;

import java.io.Serializable;

public class Author implements Serializable{


	private static final long serialVersionUID = 8015145860499601143L;
	
	private Integer id;
	private String firstName;
	private String lastName;
	
	public Author()
	{
		super();
	}
	
	public Author(Integer id, String firstName, String lastName)
	{
		super();
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((firstName == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : id.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Author other = (Author) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (firstName == null)
		{
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null)
		{
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	@Override
	public String toString()
	{
		return String.format("Author [id=%s, FirstName=%s, LastName=%s]", id, firstName, lastName);
	}
}
