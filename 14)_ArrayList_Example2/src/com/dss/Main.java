package com.dss;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList al= new ArrayList();
        al.add(new Student(1,"shilpa")); // object data insertion in arraylist
        al.add(new Employee(23,"john"));  // object data insertion in arraylist
        al.add("saroj");
        al.add(10);
        al.add(null);
        al.add(10);

        System.out.println("arraylist--"+al.toString());   // toString- stringify
        //to print objects as well  we need to use forEach loop
        for (Object o: al) {
            if(o instanceof Student){
                Student std= (Student)o;  // typecasting is required for objects
                System.out.println("student object data--->id is "+std.sid+ " and name "+std.sname) ;
            }
            if(o instanceof Employee){
                Employee emp = (Employee) o;
                System.out.println("Employee object data--> id is "+ emp.eid+" and name "+emp.ename);
            }
            if(o instanceof Integer){
                // for integers and String typecaste is not required
                System.out.println("integer=> "+o);
            }
            if(o instanceof String){
                System.out.println("string=> "+o);
            }
            // if we check null value using o is instanceof null then compiler will give null pointer exception
            if(o == null){
                System.out.println(o);
            }
        }
    }
}
