package com.liuhaozzu.designpattern.simplefactory;

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
		Fruit apple = new Apple();
		Fruit banana = new Banana();

		apple.get();
		banana.get();
	}
}