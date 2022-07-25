package entity;

public class MyMath<T extends Number> {
	
	@SuppressWarnings("unchecked")
	public T sum( T... number) {
		Float a = 0f;
		for (T t : number) {
			a += t.floatValue();
		}
		return (T) a;
	}
	
	
}
