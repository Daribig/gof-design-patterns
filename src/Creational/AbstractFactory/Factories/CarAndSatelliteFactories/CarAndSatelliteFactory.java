package Creational.AbstractFactory.Factories.CarAndSatelliteFactories;

import Creational.AbstractFactory.Car;
import Creational.AbstractFactory.Satellite;

public abstract class CarAndSatelliteFactory {
	public abstract Car createCar();
	public abstract Satellite createSatellite();
}
