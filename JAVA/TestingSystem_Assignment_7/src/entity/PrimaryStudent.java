package entity;

public class PrimaryStudent extends Student {

	public static int d = 0;
	
	public PrimaryStudent() {
		super();
		++d;
	}
}
