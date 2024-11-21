package com.campusdual.classroom;

public class Car {

    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    // Cuentarevoluciones
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car(){

    }

    public void start(){
        if (this.tachometer == 0){
            this.setTachometer(1000);
            System.out.println("Vehiculo encendido");
        }else {
            System.out.println("Vehiculo ya encendido");
        }
    }

    public void stop(){
        if (getSpeedometer() > 0){
            System.out.println("El vehiculo tiene que estar parado");
        } else {
            this.setTachometer(0);
        }
    }
    public void accelerate(){

        this.speedometer += 10;
        if (this.speedometer > MAX_SPEED){
            this.speedometer = 120;
            System.out.println("Velocidad máxia alcanzada");
        }


    }

    public void brake(){

        this.speedometer -= 10;
        if (this.speedometer <= 0){
            this.speedometer = 0;
        }

    }

    public void turnAngleOfWheels(int angle){
        int newAngle = this.wheelsAngle + angle;
        if (newAngle >= -45 && newAngle <= 45){
            this.wheelsAngle = newAngle;
        } else if (newAngle < 0) {
            this.wheelsAngle = -45;
        }else {
            this.wheelsAngle = 45;
        }


    }

    public void showSteeringWheelDetail(){

    }

    public void inReverse(boolean reverse){

    }

    // GETTERS AND SETTERS

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getFuel() {
        return fuel;
    }

    public int getSpeedometer() {
        return speedometer;
    }

    public void setSpeedometer(int speedometer) {
        this.speedometer = speedometer;
    }

    public int getTachometer() {
        return tachometer;
    }

    public void setTachometer(int tachometer) {
        this.tachometer = tachometer;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        if (reverse){
            if (getSpeedometer() == 0){
                this.reverse = true;
                this.gear = "R";
            } else {
                this.reverse = false;
            }
        } else {
            this.gear = "N";
            this.reverse = false;
        }


    }

    public int getSteeringWheelAngle() {
        return wheelsAngle;
    }

    public void setSteeringWheelAngle(int steeringWheelAngle) {
        this.wheelsAngle = steeringWheelAngle;
    }


    public boolean isTachometerEqualToZero() {
        return getTachometer() == 0;

    }

    public boolean isTachometerGreaterThanZero() {

        return this.getTachometer() > 0;
    }
}
