package com.lazy;

public class Main {

	public static void main(String[] args) {

		LazySingleton lazy = LazySingleton.getInstance();
		System.out.println(lazy.hashCode());
	}

}
