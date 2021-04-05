package Creational.SimpleFactory;

import Creational.SimpleFactory.CarParts.*;

public class CarFactory {
    // Note: What does 'static' actually do? Guess we'll find out when building our
    // own compiler for a Java-like language, in the Nand2Tetirs course... cool!
    public static Car createCar(){
        MetalBody metalBody = new MetalBody();
        SteeringWheel steeringWheel = new SteeringWheel();
        RoadWheel wheel = new RoadWheel();
        Car car = new Car(metalBody, steeringWheel, wheel);
        return car;
    }
}
