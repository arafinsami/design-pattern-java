package com.staticblock;

public class Main {

	public static void main(String[] args) {

		StaticblockSingleton instance = StaticblockSingleton.getInstance();
		System.out.println(instance.hashCode());
	}

}
