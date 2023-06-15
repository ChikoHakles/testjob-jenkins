//package id.co.indivara.jdt12.bookstore.controller;
//
//import id.co.indivara.jdt12.bookstore.entities.Book;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//@RestController
//public class BookController {
//    public static HashMap<String, Book> bookList = new HashMap<>();
//    @GetMapping("/book")
//    public ArrayList<Book> getBook() {
//        ArrayList<Book> result = new ArrayList<>();
//        bookList.forEach((s, book) -> {
//            result.add(book);
//        });
//        return result;
//    }
//
//    @GetMapping("/book/{isbn}")
//    public Book getBook(@PathVariable(name = "isbn") String isbn) {
//        return bookList.get(isbn);
//    }
//
//    @PostMapping("/book/{isbn}/{judul}/{pengarang}")
//    public Book createBook(@PathVariable(name = "isbn") String isbn, @PathVariable(name = "judul") String judul, @PathVariable(name = "pengarang") String pengarang) {
//        Book b = new Book(isbn, judul, pengarang);
//        bookList.put(isbn, b);
//        return b;
//    }
//
//    @PostMapping("/book")
//    public Book createBook(@RequestBody Book jsonData) {
//        Book b = new Book(jsonData.getIsbn(), jsonData.getJudul(), jsonData.getPengarang());
//        bookList.put(jsonData.getIsbn(), b);
//        return jsonData;
//    }
//
//    @PutMapping("/book/{isbn}")
//    public Book updateBook(@RequestBody Book jsonData) {
//        if (bookList.get(jsonData.getIsbn()) == null) {
//            return new Book("0", "Tidak Ada!", "Tidak Ada!");
//        }
//        Book b = new Book(jsonData.getIsbn(), jsonData.getJudul(), jsonData.getPengarang());
//        bookList.replace(jsonData.getIsbn(), b);
//        return jsonData;
//    }
//
//    @DeleteMapping("/book/{isbn}")
//    public Book deleteBook(@RequestBody Book jsonData) {
//        if (bookList.get(jsonData.getIsbn()) == null) {
//            return new Book("0", "Tidak Ada!", "Tidak Ada!");
//        }
//        bookList.remove(jsonData.getIsbn());
//        return jsonData;
//    }
//}