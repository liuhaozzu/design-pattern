package com.liuhaozzu.designpattern.simplefactory;

/**
 * 1，工厂（Creater）角色 简单工厂模式的核心，负责实现创建所有实例的内部逻辑。<br/>
 * 2，抽象（Product）角色 简单工厂模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口。 <br/>
 * 3，具体产品（Concrete Product）角色 简单工厂模式所创建的具体实例对象。 <br/>
 * 
 * @author Administrator
 *
 */
public class FruitFactory {

	private FruitFactory() {
		// do nothing
	}

	// get Fruit instance
	/*
	 * public static Fruit getApple() { return new Apple(); }
	 * 
	 * public static Fruit getBanana() { return new Banana(); }
	 */
	public Fruit getFruit(String type) {
		/*
		 * if (type.equalsIgnoreCase("apple")) { return
		 * Apple.class.newInstance(); } else { return
		 * Banana.class.newInstance(); }
		 */
		try {
			Class clazz = Class.forName(type);
			return (Fruit) clazz.newInstance();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
