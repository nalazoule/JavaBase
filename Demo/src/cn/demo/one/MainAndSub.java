package cn.demo.one;

public class MainAndSub implements Runnable {
	int b = 100;

	@Override
	public void run() {
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void method1() throws Exception {
		b = 1000;
		Thread.sleep(5000);
		System.out.println("b--------" + b);
	}

	public synchronized void method2() throws Exception {
		Thread.sleep(2500);
		b = 2000;
	}

	public static void main(String[] args) throws Exception {

		MainAndSub tt = new MainAndSub();
		Thread thread = new Thread(tt);
		thread.start();

		tt.method2();
		System.out.println(tt.b);

	}

}
