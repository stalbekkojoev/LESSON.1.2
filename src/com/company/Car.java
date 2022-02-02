package com.company;

public abstract class Car {
    private int diskSize;
    private String motor;
    private Color color;

    public Color getColor() {
        return color;
    }

    public Car(int diskSize, String motor, Color color) {
        this.diskSize = diskSize;
        this.motor = motor;
        this.color = color;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public String getMotor() {
        return motor;
    }


}
