package poly.basic;

public class PolyMain {
	
	public static void main(String[] args) {
		
		System.out.println("----------1---------");
		
		Parent parent = new Parent();
		parent.ParentMethod();
		
		System.out.println("----------2---------");
	
		Child child = new Child();
		child.ParentMethod();
		
		System.out.println("----------3---------");
		Parent poly = new Child();
		poly.ParentMethod();
		
	}

}
