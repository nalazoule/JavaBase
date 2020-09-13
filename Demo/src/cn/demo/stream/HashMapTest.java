package cn.demo.stream;

import java.util.HashMap;

public class HashMapTest {
	static int num = 1;

	public static void main(String[] args) {
		String s;
		System.out.println(num);
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("a", "A");
		hashMap.put("b", "A");
		hashMap.put("a", "A");
	}

}
