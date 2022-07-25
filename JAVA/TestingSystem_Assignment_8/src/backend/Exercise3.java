package backend;

import java.util.ArrayList;
import java.util.List;

import entity.Student3;

public class Exercise3 {
	
	public <T>  void print(T t) {
		System.out.println(t.toString());
	}
	
	public <T>  void printArray(List<T> t) {
		for (T i : t) {
			System.out.println(i);
		}
	}

	public void question1() {
		Student3<Integer> st1 = new Student3<>(1, "Helo");
		Student3<Float> st2 = new Student3<>(2f, "Helo");
		Student3<Double> st3 = new Student3<>(3d, "Helo");
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(st3.toString());
	} 
	
	public void question2() {
		Student3<Integer> st1 = new Student3<>(1, "Helo");
		int a = 2;
		String b = "Helo";
		print(st1);
		print(a);
		print(b);
	} 
	
	public void question3() {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		List<Float> floats = new ArrayList<Float>();
		floats.add(1f);
		floats.add(2f);
		floats.add(3f);
		List<Double> doubles = new ArrayList<Double>();
		doubles.add(1d);
		doubles.add(2d);
		doubles.add(3d);
		System.out.println("List interger:");
		printArray(integers);
		System.out.println("List float:");
		printArray(floats);
		System.out.println("List double:");
		printArray(doubles);
	}
}
