package com.company;

public class Jeep extends Car{
    private int gabarit;

    public int getGabarit() {
        return gabarit;
    }

    public Jeep(int diskSize, String motor, Color color, int gabarit) {
        super(diskSize, motor, color);
        this.gabarit = gabarit;
    }

    public void fara (String fara){
        System.out.println(fara);
    }

    public final void fara (String fara, int call){
        for (int i = 0; i < call; i++) {
            System.out.println(fara);
        }
    }

    public String info(){
        return "Размер диска: "+getDiskSize()+
                "\nМотор"+getMotor()+
                "\nгабарит"+gabarit;
    }
}
