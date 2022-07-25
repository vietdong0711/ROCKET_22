package frontend;

import backend.Exercise5;

public class Program {
	static int count=0;
	
	public Program() {
		count++;
	}
	public static void main(String[] args) {
		new Program();
		new Program();
		new Program();
		System.out.println("count=" + count);
		
	}
}
