package com.company;

import java.util.Objects;

public class Test {

    public static void main(String[] args) {
//created objects of Employee class
        Employee[]Em = new Employee[3];
        Employee e1 = new Employee(1, "abc");
        Employee e2 = new Employee(2, "xyz");
        Em[0] = e1;
        Em[1] = e2;
        /*
            for(Employee ee:Em){
                System.out.println(ee.eid+"---and---"+ee.ename);
            }
        */

        /* Null Pointer Exception
        *  if we have array of size suppose size is 3 here and we assign values only to some of indexes or locations and
        *   we want to print NUll values also along with data like above for loop, we will get Null Pointer Exception
        *   To avoid This exception: we can use Object class like below to print array contains data and null values also
        * */
        for (Object o:Em){
            if(o instanceof Employee) {
                Employee eo = (Employee) o;  // typecasting
                System.out.println(eo.eid+ "   and   "+eo.ename);
            }
            if(o == null){
                System.out.println(o);
            }

        }
    }
}