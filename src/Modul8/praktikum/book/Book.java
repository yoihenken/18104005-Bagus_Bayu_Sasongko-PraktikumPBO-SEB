package Modul8.praktikum.book;

public class Book {
    public void issueBook (int days){
        if (days > 0) System.out.println("Book Issued");
        else System.out.println("Cant issue for 0 or less days");
    }
}
