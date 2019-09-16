package com.first_project;

public class Main {

    public static void main(String[] args) {

        int num = 73489;
        int reversenum = 0;
        while(num != 0){
            reversenum = reversenum * 10 + num%10;
            num = num/10;
        }
        System.out.println(reversenum);
        

    }
}
