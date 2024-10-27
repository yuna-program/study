package generics;

public class GenericBoxMain {
	
	public static void main(String[] args) {
		
		GenericBox1<Integer> box1 = new GenericBox1<>(123);
		
		box1.printItem();
		
		GenericBox1<String> box2 = new GenericBox1<>("가가");
		
		box2.printItem();
	}

}
