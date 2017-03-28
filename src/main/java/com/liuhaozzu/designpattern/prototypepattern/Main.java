package com.liuhaozzu.designpattern.prototypepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 1， 由原型对象自身创建目标对象，也就是说对象创建这一动作是发自原型对象本身的<br/>
 * 2，目标对象是原型对象的一个克隆，也就是说，通过Prototype模式创建的对象，不仅仅与原型具有相同的结构，还与原型对象具有相同的值<br/>
 * 3， 根据对象克隆深度层次的不同，有浅度克隆和深度克隆<br/>
 * 
 * @author Administrator
 *
 */
public class Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("zhangsan");
		p1.setAge(16);
		p1.setSex("男");
		List<String> friends = new ArrayList<>();
		friends.add("wangwu");
		p1.setFriends(friends);

		System.out.println(p1.toString() + System.identityHashCode(p1));

		Person p2 = p1.clone();
		p2.setName("wangwu333");

		/*
		 * p2.setName("beifeng"); p2.setAge(16); p2.setSex("男");
		 */
		System.out.println(p2.toString() + System.identityHashCode(p2) + "haha");
		System.out.println(p2.toString() + System.identityHashCode(p2));

		// p1.getFriends().add("hahaha");
		p1.getFriends();

		System.out.println(p1.toString() + System.identityHashCode(p1));
	}
}
