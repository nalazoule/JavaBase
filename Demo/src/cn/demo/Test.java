package cn.demo;

public class Test {
	public static void main(String[] args) {
		int jieCheng = jieCheng(5);
		System.out.println(jieCheng);
	}

	public static int jieCheng(int n) {
		if (n == 9) {
			return n;
		}
		return n * jieCheng(n - 1);
	}
}
