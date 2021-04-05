package Creational.SimpleFactory;

import Creational.SimpleFactory.CarParts.*;

class Program{
    public static void main(String[] args){
        System.out.println("Welcome to the entry point to the demo of the "
                        + "'Simple Factory' design pattern!");
        Program.withoutDesignPattern();
        Program.withDesignPattern();
    }

    public static void withoutDesignPattern(){
        System.out.println("Demo-ing the problem that is solved by the "
                            + "'Simple Factory' design pattern.");
        MetalBody metalBody = new MetalBody();
        Paint paint = new Paint();
        Wheel wheel = new Wheel();
        Car car = new Car(metalBody, paint, wheel);
        System.out.println(car);
    }

    public static void withDesignPattern(){
        System.out.println("Demo-ing the solution to the problem - where the solution "
                        + "is using the 'Simple Factory' design pattern.");
        Car car = CarFactory.createCar();
        System.out.println(car);
    }
}