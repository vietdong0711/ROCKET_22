
public class Exercise3 {

	public void question1() {
		Integer a = 5000;
		float b = a.floatValue();
		System.out.printf("Question 1:  %.2f \n",b);
	}
	
	public void question2() {
		String aString = "1234567";
		int b = Integer.valueOf(aString);
		
		System.out.println("Question 2: "+b);
	}
	
	public void question3() {
		Integer a = 1234567;
		int b = a.intValue();
		System.out.printf("Question 3: "+b);
	}
	
	public static void main(String[] args) {
		Exercise3 e = new Exercise3();
		e.question1();
		e.question2();
		e.question3();
	}
}
