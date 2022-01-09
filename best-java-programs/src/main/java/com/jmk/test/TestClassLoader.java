package com.jmk.test;

import java.io.IOException;
import java.io.InputStream;

public class TestClassLoader extends ClassLoader {
	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		if (!name.equals("Test")) {
			return super.loadClass(name);
		}
		try {
			InputStream in = ClassLoader.getSystemResourceAsStream("Test.class");
			byte[] a = new byte[10000];
			int len = in.read(a);
			in.close();
			return defineClass(name, a, 0, len);
		} catch (IOException e) {
			throw new ClassNotFoundException();
		}
	}

}

