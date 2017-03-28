package com.liuhaozzu.designpattern.factorymethod;

public class Main {
	public static void main(String[] args) {
		/*
		 * // instance an apple Apple apple = new Apple();
		 * 
		 * // instance a banana Banana banana = new Banana();
		 * 
		 * apple.get(); banana.get();
		 */
		// 实例化
		FruitFactory ff = new AppleFactory();
		Fruit apple = ff.getFruit();
		apple.get();
		FruitFactory ff2 = new PearFactory();
		Fruit pear = ff2.getFruit();
		pear.get();
	}
}