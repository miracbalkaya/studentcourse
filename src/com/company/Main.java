package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Course Name: BALKAYA COURSE");


        char welcome[]={'W','e','l','c','o','m','e'};
        String welString = new String(welcome);
        System.out.println("\t\t\t    " + welString);

        ConsOverload a= new ConsOverload("\t\tStudent");
        ConsOverload b = new ConsOverload();
        a.printName();
        b.printName();

        overriding ov = new overriding();
        ov.myMethod();

        // Ask how many new student we want to add = Kaç öğrenci eklemek istediği sorulur
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students = n sayıda yeni öğrenci oluştur
        for (int n = 0; n < numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].totalPay();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }
    }
}
