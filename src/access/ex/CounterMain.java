package access.ex;

public class CounterMain {
	
	public static void main(String[] args) {
		MaxCounter counter = new MaxCounter(5);
		
		counter.increament();
		counter.increament();
		counter.increament();
		counter.increament();
//		System.out.println(counter.getCount());
	}

}
