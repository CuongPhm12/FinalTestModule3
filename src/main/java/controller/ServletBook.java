package controller;

import model.Book;
import model.Student;
import service.book.BookService;
import service.student.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletBook", value = "/books")
public class ServletBook extends HttpServlet {
    BookService bookService = new BookService();
//    StudentService studentService = new StudentService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action =request.getParameter("action");
        if(action==null){
            action = "";
        }
        switch (action){
            default:
                showList(request,response);
                break;
        }


    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Book> bookList = bookService.findAll();

        RequestDispatcher dispatcher = request.getRequestDispatcher("book/list.jsp");
        try {
            request.setAttribute("bookList", bookList);
            dispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
