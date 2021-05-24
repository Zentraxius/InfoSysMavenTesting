package com.qa.examplejunit.house;

import java.util.List;

import com.qa.examplejunit.garage.Garage;

public class House {
//Attributes
	// Door, Windows, Lights, Chimney, Rooms, Garage, protected String address
	// constructor, methods, get/set
	
	protected Door frontDoor;
	protected List<Window> propertyWindows;
	protected String address;
	protected Garage attachedGarage;
	
	public House() {
		super();
	}

	public House(Door frontDoor, List<Window> propertyWindows, String address, Garage attachedGarage) {
		super();
		this.frontDoor = frontDoor;
		this.propertyWindows = propertyWindows;
		this.address = address;
		this.attachedGarage = attachedGarage;
	}
	
}
