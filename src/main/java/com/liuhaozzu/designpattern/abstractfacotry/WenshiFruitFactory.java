package com.liuhaozzu.designpattern.abstractfacotry;

public class WenshiFruitFactory implements FruitFactory {

	@Override
	public Fruit getApple() {
		// TODO Auto-generated method stub
		return new WenshiApple();
	}

	@Override
	public Fruit getBananr() {
		// TODO Auto-generated method stub
		return new WenshiBanana();
	}

}
