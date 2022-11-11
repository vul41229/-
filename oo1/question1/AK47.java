package oo1.question1;

import java.util.Random;

public class AK47 {
    int bullets = 100;
    public void fire() {
        if(bullets == 0) {
            System.out.println("沒有子彈");
            return;
        }
        int r = new Random().nextInt(10);
        if(r > bullets) {
            r = bullets;
        }
        bullets -= r;
        for(int i=0;i<r;i++) {
            System.out.print("突突突");
        }
        System.out.println("~");
        if(bullets == 0) {
            System.out.println("彈匣空了");
        }
    }
    public void load() {
        bullets = 100;
        System.out.println("彈匣已裝滿");
    }
}
