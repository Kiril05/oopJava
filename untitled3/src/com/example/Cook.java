package com.example;

public class Cook extends Human {
    private boolean chef;
    public Book cookBook = new Book("Cook book", "mr. Chef");
    public Cook(String name, int age, boolean chef) {
        super(name, age);
        this.setJob("cook");
        this.chef = chef;
    }


    public void cook(String food) {
        System.out.println(this.getName() + " is cooking " + food + ".");
    }
    public boolean isChef() {
        return chef;
    }
    public void setChef(boolean chef) {
        this.chef = chef;
    }

}
