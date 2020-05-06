package com.javabykiran;

public class Book {
	Author author;
	int pages;
	public Book(Author author, int pages) {
		super();
		this.author = author;
		this.pages = pages;
	}

	public Book(Author author) {
		super();
		this.author = author;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
}
