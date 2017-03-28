package com.liuhaozzu.designpattern.builder;

public class HouseDirector {
	private HouseBuilder builder;

	public HouseDirector(HouseBuilder builder) {
		this.builder = builder;
	}

	public void makeHouse() {
		builder.makeFloor();
		builder.makeWall();
		builder.makeHouseTop();

	}

}
