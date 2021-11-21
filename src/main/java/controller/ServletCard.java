package controller;

import model.Student;
import service.book.BookService;
import service.student.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletCard", value = "/cards")
public class ServletCard extends HttpServlet {
    BookService bookService = new BookService();
    StudentService studentService = new StudentService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action =request.getParameter("action");
        if(action==null){
            action = "";
        }
        switch (action){
            case "borrow":
                showBorrowForm(request,response);
                break;
            default:
                showList(request,response);
        }


    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showBorrowForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("card/borrow.jsp");
        try {
            List<Student> studentList = studentService.findAll();
            request.setAttribute("studentList",studentList);
            dispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action =request.getParameter("action");
        if(action==null){
            action = "";
        }
        switch (action){
            case "borrow":
                BorrowBook(request,response);
                break;
            default:
                showList(request,response);
        }

    }

    private void BorrowBook(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("card/borrow");
        try {

            dispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
