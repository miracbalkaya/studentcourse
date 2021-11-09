package com.company;

public class ConsOverload {

    private String name;

    public ConsOverload(String n){
        name = n;
    }
    public ConsOverload(){
        name = "\tEnrollment App";
    }
    public void printName(){
        System.out.print(name);
    }
}
