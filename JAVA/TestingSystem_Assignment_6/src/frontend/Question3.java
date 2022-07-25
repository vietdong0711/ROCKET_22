package frontend;

public class Question3 {

	public static void main(String[] args) {
		int[] number = { 1, 2, 3 };
		try {
			System.out.println(number[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Cannot find this number");
		}
	}

}
