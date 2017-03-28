package com.liuhaozzu.designpattern.abstractfacotry;

public class Main {

	public static void main(String[] args) {
		FruitFactory ff = new WenshiFruitFactory();
		Fruit apple = ff.getApple();
		Fruit banana = ff.getBananr();
		apple.get();
		banana.get();
	}
}
