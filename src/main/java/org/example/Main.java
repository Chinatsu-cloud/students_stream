package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Students>studentsList = new ArrayList<>();
        studentsList.add(new Students("Ota","August",1));
        studentsList.add(new Students("Kato","May",2));
        studentsList.add(new Students("Saito","Fall",3));
        studentsList.add(new Students("Tachibana","December",4));
        studentsList.add(new Students("Hashimoto","July",5));
        studentsList.add(new Students("Mouri","March",6));

        //誕生日がMから始まる生徒を大文字で表示する
        studentsList.stream()
                .filter(students -> students.getBirthday().startsWith("M"))//Mから始まる誕生日の人
                .map(students -> students.getName().toUpperCase())
                .forEach(students -> System.out.println(students));
    }
}