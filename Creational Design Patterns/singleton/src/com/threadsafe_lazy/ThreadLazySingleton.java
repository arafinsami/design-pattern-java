package com.threadsafe_lazy;

import java.util.Objects;

public class ThreadLazySingleton {

	private static ThreadLazySingleton instance;

	private ThreadLazySingleton() {
	}

	public static ThreadLazySingleton getInstance() {
		if (Objects.isNull(instance)) {
			synchronized (ThreadLazySingleton.class) {
				if (Objects.isNull(instance)) {
					instance = new ThreadLazySingleton();
				}
			}
		}
		return instance;
	}
}
