package com.example.lib;

import java.util.Scanner;

public class Myclass {

    public static void main(String[] args){

       car ca = new car();
       person per = new person();

       // check email String for UI application
       String str = "jingmailcom";
       boolean haha = str.contains("@");
       boolean hoho = str.contains(".");
       if(hoho && haha){
           System.out.println("email contains the both dot and @");
       }
       else if (!haha) {
           System.out.println("email does not contains the @");
       }
       else if(!hoho){
           System.out.println("email does not contain .");
       }
       else
           System.out.println("email does not contain both @ and .");

        // practice inheritance
        per.setYear(1990);
        per.setMake("honda");
        System.out.println(per);


    }

}
