package Creational.SimpleFactory;

import Creational.SimpleFactory.CarParts.*;

public class CarFactory {
    // Note: What does 'static' actually do? Guess we'll find out when building our
    // own compiler for a Java-like language, in the Nand2Tetirs course... cool!
    public static Car createCar(){
        MetalBody metalBody = new MetalBody();
        Paint paint = new Paint();
        Wheel wheel = new Wheel();
        Car car = new Car(metalBody, paint, wheel);
        return car;
    }
}
