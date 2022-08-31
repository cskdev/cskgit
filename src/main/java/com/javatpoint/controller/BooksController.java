package com.javatpoint.controller;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.model.Books;
import com.javatpoint.model.Employee;
import com.javatpoint.service.BooksService;
import com.javatpoint.service.EmpService;
//mark class as Controller
@RestController
public class BooksController 
{
//autowire the BooksService class
@Autowired
BooksService booksService;
@Autowired
EmpService empservice;
//creating a get mapping that retrieves all the books detail from the database 
@GetMapping("/book")
private List<Books> getAllBooks() 
{
	System.out.println("hiiiiiiiiiiiiiiii");
return booksService.getAllBooks();
}


//creating a get mapping that retrieves the detail of a specific book
@GetMapping("/book/{bookid}")
public Books getBooks(@PathVariable("bookid") int bookid) throws NoSuchElementException
{
return booksService.getBooksById(bookid, HttpStatus.OK);
}
//creating a delete mapping that deletes a specified book
@DeleteMapping("/book/{bookid}")
private void deleteBook(@PathVariable("bookid") int bookid) 
{
booksService.delete(bookid);
}
//creating post mapping that post the book detail in the database
@PostMapping("/books")
private int saveBook(@RequestBody Books books) 
{
booksService.saveOrUpdate(books);
return books.getBookid();
}
//creating put mapping that updates the book detail 
@PutMapping("/books")
private Books update(@RequestBody Books books) 
{
booksService.saveOrUpdate(books);
return books;
}

@GetMapping("/Empss")
private List<Employee> getempdatas(){
	System.out.println("Empoyeeee data");
	return empservice.getempdatas();
}

@GetMapping("/emp")
private List<Employee> getempdata() 
{
	System.out.println("hiiiiiiiiiiiiiiii");
return empservice.getempdata();
}

}
