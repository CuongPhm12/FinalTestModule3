package service.student;

import config.ConnectionSingleton;
import model.Book;
import model.Student;
import service.IService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements IService<Student> {
//    public static void main(String[] args) {
//        StudentService studentService = new StudentService();
//        List<Student> studentList = studentService.findAll();
//        System.out.println(studentList);
//    }
    Connection connection = ConnectionSingleton.getConnection();
    @Override
    public void insert(Student student) {

    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public boolean update(Student student) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Student> findAll() {

        List<Student> studentList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from student ");
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("idS");
                String name = rs.getString("nameS");
                String className = rs.getString("className");
                Student student = new Student(id,name,className);
                studentList.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return studentList;
    }

}
