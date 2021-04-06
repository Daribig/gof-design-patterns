package Creational.AbstractFactory.Factories.CarAndSatelliteFactories;

import Creational.AbstractFactory.Car;
import Creational.AbstractFactory.Satellite;
import Creational.AbstractFactory.Factories.CarFactories.BlackCarFactory;
import Creational.AbstractFactory.Factories.SatelliteFactories.BlackSatelliteFactory;

// black car && black satellite
public class BlackCarAndSatelliteFactory extends CarAndSatelliteFactory {

	private BlackCarFactory _carFactory;
	private BlackSatelliteFactory _satelliteFactory;
	
	public BlackCarAndSatelliteFactory() {
		this._carFactory = new BlackCarFactory();
		this._satelliteFactory = new BlackSatelliteFactory();
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
