package entity;

public class SecondaryStudent extends Student {

	public static int c = 0;

	public SecondaryStudent() {
		super();
		++c;
	}
}
