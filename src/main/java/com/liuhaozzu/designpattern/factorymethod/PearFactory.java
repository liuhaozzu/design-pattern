package com.liuhaozzu.designpattern.factorymethod;

public class PearFactory implements FruitFactory {

	@Override
	public Fruit getFruit() {
		// TODO Auto-generated method stub
		return new Pear();
	}

}
