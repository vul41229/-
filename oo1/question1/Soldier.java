package oo1.question1;

import java.util.Random;

public class Soldier {
    /*question1 設計士兵類 需求：設計士兵與武器AK47類，並完成前進、進攻、發射子彈、裝載子彈的功能 */

    int id;
    int blood = 100;
    AK47 a;

    public void go() {
        System.out.println(this.id+"號士兵前進");
    }

    public void attack() {
        if(blood == 0) {
            System.out.println("這是"+id+"號士兵的屍體");
            return;
        }
        System.out.println(id+"號士兵進攻");
        if(a != null) {
            a.fire();
        }
        int d = new Random().nextInt(10);
        blood -= d;
        if(blood < 0) {
            blood = 0;
        }
        System.out.println("血量："+blood);
        if(blood == 0) {
            System.out.println(id+"號士兵陣亡");
        }
    }
}
