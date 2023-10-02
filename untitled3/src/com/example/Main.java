package com.example;

public class Main  {

    public static void main(String[] args) {
        Cook tomas = new Cook("Tomas", 23, true);
        tomas.introduce();
        tomas.cook("Pizza");

        Janitor janitor = new Janitor("Janitor", 37);
        janitor.introduce();
        janitor.clean();
        System.out.println(janitor.getJob());

        String[] languageArray = new String[] {"Java", "JS"};
        Programmer bob = new Programmer("Bob", 18, languageArray);
        bob.setLanguages(new String[] {"Java", "JS", "C++"});

        bob.introduce();
        bob.code("C++");
        bob.code("C#");

//        Human.Book book = new Human.Book("Cool book", "Cool guy"); can't reach book, prob cause Human is abstract??

        tomas.cookBook.setBook("Book cook", "Chef mr.");
        tomas.cookBook.readBook();
        janitor.setName("Tor Jani");
    }
}
