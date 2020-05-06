package com.javabykiran;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AuthorEx {
	public static void main(String[] args) {
		List<Book> listOfBooks = new ArrayList<>();

		listOfBooks.add(new Book(new Author("kiran", 20), 350));

		listOfBooks.add(new Book(new Author("bbb", 89), 550));

		listOfBooks.add(new Book(new Author("kiran", 67), 750));

		listOfBooks.add(new Book(new Author("kiran", 40), 110));

		// i want to find author name having pages 500 >  800 <
		
		
		
		/*
		 * System.out.println(listOfBooks.stream().filter(authorsurname->(
		 * authorsurname.getAuthor().getSurName().equals("kiran")&&
		 * authorsurname.getPages()>600)) .count());
		 */
		long p = listOfBooks.stream()
				// .map(author->author.getAuthor())
				// .map(authName->authName.getSurName())
				// .map(String :: toUpperCase)
				.filter(surnameVal -> ((surnameVal.author.surName).equals("kiran") && surnameVal.pages > 300))
				// .distinct()
				// .limit(1)
				.count();
		System.out.println(p);

		List<Integer> listPages350 = listOfBooks.stream().map(pages -> pages.getPages()).filter(page -> page > 350)
				.collect(Collectors.toList());
		System.out.println(listPages350);

		List<String> listOfAuthHavingK = listOfBooks.stream().map(listOfAuthor -> listOfAuthor.getAuthor())
				.map(nameOfAuthors -> nameOfAuthors.getSurName()).map(String::toUpperCase)
				.filter(nameOfAuthors -> nameOfAuthors.contains("K")).collect(Collectors.toList());

		System.out.println(listOfAuthHavingK);

		List<Integer> listOfPage = listOfBooks.stream().map(pages1 -> pages1.getPages()).filter(page -> page > 500)
				.collect(Collectors.toList());

		System.out.println(listOfPage);

		// Get the unique surnames in upper case
		// of the first 15 book authors that are 50 years old or older.

		/*
		 * List<String> lst=listOfBooks.stream() .map(book->book.getAuthor())
		 * .map(surName->surName.getSurName()) .map(String::
		 * toUpperCase).collect(Collectors.toList()); System.out.println(lst);
		 */

		/*
		 * List<String> lst=listOfBooks.stream()
		 * .map(author->author.getAuthor()) .map(surname->surname.getSurName())
		 * .filter(surname1->surname1.equals("aa")).collect(Collectors.toList())
		 * ;
		 * 
		 * System.out.println(lst);
		 */

		/*
		 * List<Author> lst1=listOfBooks.stream().map(book->book.author)
		 * .filter(author->author.age>=50) .collect(Collectors.toList());
		 * 
		 * 
		 * List<String> lst=listOfBooks.stream() .map(book -> book.getAuthor())
		 * .filter(author -> author.getAge() >= 50) .map(Author::getSurName)
		 * .map(String::toUpperCase) .distinct() .limit(15)
		 * .collect(Collectors.toList());
		 * 
		 * System.out.println(lst);
		 */

	}
}
