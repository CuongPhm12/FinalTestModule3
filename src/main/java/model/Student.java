package model;

public class Student {
    private int idStudent;
    private String nameStudent;
    private String className;

    public Student(int idStudent, String nameStudent, String className) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.className = className;
    }

    public Student() {
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", nameStudent='" + nameStudent + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
