package com.example;

public class Janitor extends Human{
    public Janitor(String name, int age) {
        super(name, age);
        this.setJob("janitor");
    }

    @Override
    public void setName(String newName) {
        String oldName = this.getName();
        super.setName(newName);
        System.out.println("Hello, I changed my name on " + getName() + ". And my old name was " + oldName + ".");
    }

    public void clean() {
        System.out.println(this.getName() + " is cleaning.");
    }
}
