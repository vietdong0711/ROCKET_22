package frontend;

public class Question4 {

	public static void main(String[] args) {
		backend.Question4 qs4 = new backend.Question4();
		qs4.test();
		
		try {
			qs4.getIndex(10);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Cannot find department");
		}
	}
}
