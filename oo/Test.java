package oo;



import oo.question.Circle;
import oo.question.Line;
import oo.question.Question1;
import oo.question.Square;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("按Enter繼續");
        while(true) {
            int r = new Random().nextInt(4);
            switch(r) {
                case 0: f(new Question1()); break;
                case 1: f(new Line()); break;
                case 2: f(new Square()); break;
                case 3: f(new Circle()); break;
            }
        }
    }

    static void f(Question1 s) {
        System.out.println("----------------");
        new Scanner(System.in).nextLine();
        s.draw();
        if(s instanceof Line) {
            Line line = (Line) s;
            line.length();
        }
        new Scanner(System.in).nextLine();
        s.clear();
    }

}
