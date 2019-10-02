package com.javaprograms;

//Rules for constructor:
//1) constructor and class name must be same
//2) constructor able to take parameters
//3) constructors does not allow return type

public class Test {

//    A class can have multiple but  overloaded constructors only
//    All the constructor must have same name within a class i.e constructor overloading

//    if we dont declare atleast one constructor then compiler during compilation generates a zero argument constructor which is called as defualt constructor or zero argument constructor
//    if a constructor is declared no default constructor is generated by compiler

//    user defined constructor
    Test(){
        System.out.println("0 argument constructor");
    }
//   user defined  parameterized constructor
    Test(int a){
        System.out.println("1 argument constructor");
    }
    Test(int a , int b){
//       within constructor we call other  constructor of same class  using this keyword
//        one constructor is able to call only one constructor at a time within constructor of same class and it should be first statement in constructor body
        this();
//        this(10);
        System.out.println("2 argument constructor");

    }

    void method1(){
        System.out.println("method1");
    }

    public static void main(String[] args) {
//	    Test t = new Test();  // named approach for object creation
        new Test(10); // Nameless approach for object creation
        Test t2 = new Test(10,20);
        t1.method1();
//        in nameless approach non static method m1 can not be referenced from static context bcoz statc mthod doenot need object creation
//        -------Test.method1(); ---> wrong
    }
}