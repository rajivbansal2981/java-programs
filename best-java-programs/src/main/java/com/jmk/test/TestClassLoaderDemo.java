package com.jmk.test;

public class TestClassLoaderDemo {
	public static void main(String args[]) {
		try {
			Class<?> c1 = new TestClassLoader().loadClass("Test");
			Class<?> c2 = new TestClassLoader().loadClass("Test");
			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c1 == c2);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
