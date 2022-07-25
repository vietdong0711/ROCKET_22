package entity;

public class MyMath {

	public static int max(int a, int b) {
		if (a >= b) {
			return a;
		}
		return b;
	};

	public static int min(int a, int b) {
		if (a >= b) {
			return b;
		}
		return a;
	};

	public static int sum(int a, int b) {
		return a + b;
	};

}
