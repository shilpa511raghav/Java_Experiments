package com.javaprograms;

public class methodOverloading {

//    method overloading: is an example of compile time polymorphism or static binding or early binding
//    A class contains more than one method with same number and different no of arguments,
//    different sequence or same number of arguments with different datatype.
    private static void display(int a){
        System.out.println("Arguments: " + a);
    }
    private static void display(int a, int b){
        System.out.println("Arguments are both integers: " + a + " and " + b);
    }
    private static void display(String str1, String str2){
        String s = str1 + str2;
        System.out.println("Concatinated String - "+ s);

    }
    private static void display(char ch){
        System.out.println("Char display method");
    }
    public static void main(String[] args) {
        display(1);        //static methods cannot be instantiated and manages memory
        display(1, 4);
        display("joe","marini");
        display('a');
    }
}
