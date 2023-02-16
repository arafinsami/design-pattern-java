package com.threadsafe_lazy;

public class Main {

	public static void main(String[] args) {

		ThreadLazySingleton lazy = ThreadLazySingleton.getInstance();
		System.out.println(lazy.hashCode());
	}

}
