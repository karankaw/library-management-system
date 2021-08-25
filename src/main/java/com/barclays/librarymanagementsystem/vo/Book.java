package com.barclays.librarymanagementsystem.vo;

/**
 * 
 * Just for keeping it simple, I have used Name
 * I could use other attributes - ISBN, Author, PublicationDate
 * 
 * @author Karan Kaw
 *
 */
public class Book {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == this) {
			return true;
		}

		if (obj == null)
			return false;

		if (!(obj instanceof Book)) {
			return false;
		}

		Book nodeObj = (Book) obj;

		return name.equals(nodeObj.getName());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

}
