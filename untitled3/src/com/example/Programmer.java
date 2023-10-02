package com.example;

import java.util.Objects;

public class Programmer extends Human{
    private String[] languages;

    public Programmer(String name, int age, String[] languages) {
        super(name, age);
        this.languages = languages;
        this.setJob("programmer");
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public void code(String language) {
        boolean inOrder = true;
        for (int i = 0; i < this.languages.length; i++) {
            if (this.languages[i] == language) {
                inOrder = true;
                break;
            } else {
                inOrder = false;
            }
        }
        if (inOrder) {
            System.out.println(this.getName() + " is coding on " + language + ".");
        } else {
            System.out.println(this.getName() + " can't code on " + language + ".");
        }
    }
}
