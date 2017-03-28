package com.liuhaozzu.designpattern.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable {

	private String name;
	private int age;
	private String sex;
	private List<String> friends;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Person clone() {
		try {
			Person person = (Person) super.clone();

			System.out.println(this.getFriends().hashCode());
			List<String> copy = new ArrayList<>(this.getFriends());
			System.out.println("copy" + copy.hashCode());
			person.setFriends(copy);

			/*
			 * List<String> friends2 = new ArrayList<>(); for (String friend :
			 * this.getFriends()) { friends2.add(friend); }
			 * person.setFriends(friends2);
			 */
			return person;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", friends=" + friends + friends.hashCode()
				+ "]";
	}

}
