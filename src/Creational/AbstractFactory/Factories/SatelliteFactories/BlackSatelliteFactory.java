package Creational.AbstractFactory.Factories.SatelliteFactories;

import Creational.AbstractFactory.Colour;
import Creational.AbstractFactory.Satellite;

public class BlackSatelliteFactory extends SatelliteFactory {
	public Satellite createSatellite() {
		Satellite satellite = new Satellite(Colour.BLACK);
		return satellite;
	}
}
