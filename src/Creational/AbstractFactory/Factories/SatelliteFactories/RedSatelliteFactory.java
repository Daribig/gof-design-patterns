package Creational.AbstractFactory.Factories.SatelliteFactories;

import Creational.AbstractFactory.Colour;
import Creational.AbstractFactory.Satellite;

public class RedSatelliteFactory extends SatelliteFactory {
	public Satellite createSatellite() {
		Satellite satellite = new Satellite(Colour.RED);
		return satellite;
	}
}
