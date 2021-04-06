package Creational.AbstractFactory.Factories.CarAndSatelliteFactories;

import Creational.AbstractFactory.Car;
import Creational.AbstractFactory.Satellite;
import Creational.AbstractFactory.Factories.CarFactories.RedCarFactory;
import Creational.AbstractFactory.Factories.SatelliteFactories.RedSatelliteFactory;

// red car && red satellite
public class RedCarAndSatelliteFactory extends CarAndSatelliteFactory {

	private RedCarFactory _carFactory;
	private RedSatelliteFactory _satelliteFactory;
	
	public RedCarAndSatelliteFactory() {
		this._carFactory = new RedCarFactory();
		this._satelliteFactory = new RedSatelliteFactory();
	}
	
	@Override
	public Car createCar() {
		return this._carFactory.createCar();
	}

	@Override
	public Satellite createSatellite() {
		return this._satelliteFactory.createSatellite();
	}

}
