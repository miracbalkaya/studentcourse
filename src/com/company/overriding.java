package com.company;

//// Overriding method
public class overriding {
    public void myMethod(){
        System.out.println("\n***************************************************");
    }
}

//Inheritance
class Demo extends overriding{
    public void myMethod(){
        //Super keyword
        super.myMethod();

    }
}
