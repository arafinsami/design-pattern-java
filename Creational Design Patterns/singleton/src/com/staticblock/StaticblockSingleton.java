package com.staticblock;

public class StaticblockSingleton {

	private static StaticblockSingleton instance;

	private StaticblockSingleton() {
	}

	static {
		try {
			instance = new StaticblockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occurred");
		}
	}

	public static StaticblockSingleton getInstance() {
		return instance;
	}
}
