package service.book;

import config.ConnectionSingleton;
import model.Book;
import model.Student;
import service.IService;
import service.card.CardService;
import service.student.StudentService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookService implements IService<Book> {
    Connection connection = ConnectionSingleton.getConnection();
    StudentService studentService = new StudentService();
    CardService cardService = new CardService();

//    public static void main(String[] args) {
//        BookService bookService = new BookService();
////        Book book = new Book(3,"Nhà giả kim","coelho","kinh thánh",50)
//        Book book = bookService.findById(2);
//        System.out.println(book);
//
//
//    }

    @Override
    public void insert(Book book) {

    }

    @Override
    public Book findById(int id) {
        Book book = null;
        try {
            PreparedStatement statement = connection.prepareStatement("select * from book where id=?");
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                String name = rs.getString("nameB");
                String author = rs.getString("author");
                int quantity = rs.getInt("quantity");
                String description = rs.getString("description");
                book = new Book(id,name,author,description,quantity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return book;
    }

    @Override
    public boolean update(Book book) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Book> findAll() {
        List<Book> bookList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from book ");
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("idB");
                String name = rs.getString("nameB");
                String author = rs.getString("author");
                int quantity = rs.getInt("quantity");
                String description = rs.getString("description");
                Book book = new Book(id,name,author,description,quantity);
                bookList.add(book);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return bookList;
    }
}
