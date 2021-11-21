package model;

import java.sql.Date;
import java.time.LocalDate;

public class Card {
    private int idCard;
    private Book book;
    private Student student;
    private boolean status = true;
    private Date borrowDate;
    private Date returnDate;

    public Card(int idCard, Book book, Student student, boolean status, Date borrowDate, Date returnDate) {
        this.idCard = idCard;
        this.book = book;
        this.student = student;
        this.status = status;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }


    public Card() {
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Card{" +
                "idCard=" + idCard +
                ", book=" + book +
                ", student=" + student +
                ", status=" + status +
                ", borrowDate=" + borrowDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
