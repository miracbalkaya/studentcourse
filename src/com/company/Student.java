package com.company;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int semester;
    private String paymentID;
    private String courses = null;
    private int tuitionBalance = 500;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student(){  //Yapıcı: kullanıcıdan öğrencinin adını ve dönemini girmesini ister
        int x = 1;
        do {  //Döngü yaparken yapın, bu nedenle kullanıcı yanlış girdi girerse işlem tekrarlanır
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter student first name: ");
                this.firstName = in.nextLine();

                System.out.print("Enter student last name: ");
                this.lastName = in.nextLine();

                System.out.println("------------------------------------");
                System.out.print("1 - Semester 1\n2 - Semester 2\n3 - Semester 3\n4 - Semester 4\n5 - Semester 5\nEnter your semester: ");
                this.semester = in.nextInt();

                System.out.println("------------------------------------");
                setStudentID();

                x=2;   //Kullanıcı tüm doğru girişi girdiğinde, do while döngüsü durur
            }
            catch (Exception e){   //hata olduğunda catch ifadesi aşağıdaki yazı olur
                System.out.println("\n\tOops! Wrong input. PleaseTry Again\n");
            }
        }
        while (x==1);   //Kullanıcı yanlış girişi girerse işlemi yeniden başlatır
    }
     //Constructor : Bir makbuz kimliği oluştur
    private void setStudentID(){
        //Semester level + ID
        id++;
        this.paymentID = semester + "" + id;
    }

    //Enroll in courses = Derslere kayıt ol
    public void enroll(){
        do {
            System.out.print("Enter course to enroll(Q to quit when finish.): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("q")){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        }
        while (1 != 0);
        System.out.println("----------------------------------------");
        System.out.println("\n");
        System.out.println("*****************************************");
    }

    //Display total amount to pay = Ödenecek toplam tutarı göster
    public void totalPay(){
        int totPayment = 0;
        totPayment = tuitionBalance - 500;
        System.out.println("Total payment for the courses is: RM" + totPayment);
        System.out.println("*****************************************");
    }

    //View balance = Bakiyeyi görüntüle
    public void viewBalance(){
        System.out.println("Your current account balance: RM" + tuitionBalance);
    }

    // Pay tuition = Harç ödemek
    public void payTuition(){
        int x = 1;
        do {
            try {  ////Exception handling start = İstisna işleme başlangıcı
                viewBalance();   ////To show balance in account = Hesaptaki bakşyeyi görüntülemek için
                System.out.print("Enter your payment: RM");
                Scanner in = new Scanner(System.in);
                int payment = in.nextInt();
                tuitionBalance = tuitionBalance - payment;
                System.out.print("\n");
                System.out.println("----------------------------------------");
                System.out.println("Thank you for your payment of RM" + payment);
                viewBalance();

                x=2;   //When user input all the right input, the do while loop stop = Kullanıcı bilgileri doğru girince döndğ durur
            }
            catch (Exception e){  //Catch statement when error happened = Hata oluştuğunda ifadeyi yakala
                System.out.println("\n\tOops! Wrong input. PleaseTry Again\n");
            }
        }while (x==1);
    }

    //Show status = Durumu göster
    public String toString(){
        return "Name: " + firstName + " " + lastName + "\nSemester: " + semester + "\nReceipt ID: " + paymentID + "\nCourses Enrolled: " + courses + "\nBalance RM: " +tuitionBalance + "\n-----------------------------------------";
    }
}
