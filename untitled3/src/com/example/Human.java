package com.example;

public abstract class Human {

    private String name;
    private int age;
    private String job;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void introduce() {
        System.out.println(this.name + " is " + this.age + " years old. Working as a " + this.job + ".");
    }
    public class Book {
        private String bookName;
        private String bookAuthor;

        public Book(String bookName, String bookAuthor) {
            this.bookName = bookName;
            this.bookAuthor = bookAuthor;
        }
        public void setBook(String bookName, String bookAuthor) {
            this.bookName = bookName;
            this.bookAuthor = bookAuthor;
        }
        public void readBook() {
            System.out.println(getName() + " is reading " + this.bookName + " written by " + this.bookAuthor + ".");
        }
    }

}
