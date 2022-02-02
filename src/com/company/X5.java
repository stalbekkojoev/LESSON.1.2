package com.company;

public final class X5 extends Jeep{
    private String salon;


    public String getSalon() {
        return salon;
    }

    public X5(int diskSize, String motor, Color color, int gabarit, String salon) {
        super(diskSize, motor, color, gabarit);
        this.salon = salon;
    }

    public String info(){
        return "Размер диска"+getDiskSize()+
                "\nмотор"+getMotor()+
                "\nгабарит"+getGabarit()+
                "\nсалон"+salon;
    }
}
