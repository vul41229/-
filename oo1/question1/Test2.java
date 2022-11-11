package oo1.question1;

import oo1.question1.AK47;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        AK47 a = new AK47();
        System.out.println("按Enter涉及，輸入load裝子彈");
        while(true) {
            String s = new Scanner(System.in).nextLine();
            if(s.equals("load")) {
                a.load();
                continue;
            }
            a.fire();
        }
    }
}

