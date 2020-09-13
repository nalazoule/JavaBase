package cn.demo.stream;

public class Singleton {
	private Singleton() {
	}

	private static class SingletonInstance {
		static Singleton instance = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonInstance.instance;
	}
}
