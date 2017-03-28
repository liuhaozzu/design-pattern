package com.liuhaozzu.designpattern.builder;

public class Main {

	public static void main(String[] args) {
		House house = new House();
		house.setFloor("地板");
		house.setWall("墙");
		System.out.println(house);

		// 第二种方案
		HouseBuilder builder = new PingfangBuilder();
		builder.makeFloor();
		builder.makeHouseTop();
		builder.makeWall();
		House house2 = builder.getHouse();

		System.out.println(house2);

		// 第三种方案
		HouseDirector director = new HouseDirector(builder);
		director.makeHouse();
		House house3 = builder.getHouse();
		System.out.println(house3);
	}
}
