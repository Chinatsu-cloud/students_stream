package org.example;

public class Students {

    private String name;

    private String birthday;

    private int number;

    public Students(String name, String birthday, int number) {
        this.name = name;
        this.birthday = birthday;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getNumber() {
        return number;
    }
}

