package com.javaprograms;

import java.util.ArrayList;

/*ArrayList Constructors
* default capacity of ArrayList constructor : 10;
* when default capacity  reached max of it (10 default here) then new capacity becomes old*3/2+1
*we can also define initial capacity
*  */
public class Test {

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();  // default constructor
        a1.add(10);
        a1.add(20);
        a1.add(30);

        ArrayList<Integer> a2;  //Declaration and provided (typesafe -It makes the code stable by detecting the bugs at compile time and the code does not require typecasting)
        a2 = new ArrayList<Integer>(); // Assignment
        a2.add(100);

        /*Two approaches to combine arrayLists
        1)- add()- used To add only one object or one collection data to another
        * */
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(100);
        a3.add(200);

        ArrayList<Integer> a4 = new ArrayList<>(a3);
        a3.add(300);
        System.out.println("a3-------:  "+a3);
        // from above we found that ArrayList constructor takes only one argument then how to add multiple collections into another use addAll() method
        /*2)-addAll() - used To add collection data
        * */
        ArrayList b1 = new ArrayList();
        b1.add(800);
        b1.add("sh");
        ArrayList b2 = new ArrayList();
        b2.add(900);
        b2.add(1000);

        ArrayList b3 = new ArrayList();
        b3.add(111);
        b3.addAll(b1);
        b3.addAll(b2);

        System.out.println("b3------:   "+b3);
    }
}
