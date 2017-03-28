package com.liuhaozzu.designpattern.builder;

public class PingfangBuilder implements HouseBuilder {
	House house = new House();

	@Override
	public void makeFloor() {
		house.setFloor("平房--》地板");
	}

	@Override
	public void makeWall() {
		house.setWall("平房--》墙");
	}

	@Override
	public void makeHouseTop() {
		house.setHouseTop("平房--》房顶");
	}

	@Override
	public House getHouse() {
		return house;
	}

}
