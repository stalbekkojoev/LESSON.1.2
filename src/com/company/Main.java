package com.company;

public class Main {

    public static void main(String[] args) {
        Jeep gelik = new Jeep(19,"М113К", Color.BLACK,2);
        gelik.fara("включил фары",3);
        System.out.println(gelik.info());
        System.out.println("-------------------------");
        X5 BMW = new X5(20,"N62",Color.WHITE,3,"кожа");
        BMW.fara("выключил фары",2);
        System.out.println(BMW.info());
        System.out.println("-------------------------");
        X5 e53 = new X5(18,"N62",Color.RED,2,"кожа");
        BMW.fara("включил фары",3);
        System.out.println(e53.info());








    }
}
