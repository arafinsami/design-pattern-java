package com.eager;

public class Main {

	public static void main(String[] args) {

		EagerSingleton eager = EagerSingleton.getInstance();
		System.out.println(eager.hashCode());
	}

}
