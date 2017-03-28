package com.liuhaozzu.designpattern.prototypepattern;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		System.out.println(new ArrayList<>().hashCode());
		System.out.println(new ArrayList<>().hashCode());
		System.out.println(new ArrayList<>().hashCode());
		System.out.println(new ArrayList<>().hashCode());
		System.out.println(new ArrayList<>().hashCode());
		System.out.println(System.identityHashCode(new ArrayList<>()));
		System.out.println(System.identityHashCode(new ArrayList<>()));
		System.out.println(System.identityHashCode(new ArrayList<>()));
		System.out.println(System.identityHashCode(new ArrayList<>()));
		System.out.println(System.identityHashCode(new ArrayList<>()));

	}
}
