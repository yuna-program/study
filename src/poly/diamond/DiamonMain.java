package poly.diamond;

public class DiamonMain {
	
	public static void main(String[] args) {
		
		InterfaceA interfaceA = new Child();
		interfaceA.methodA();
		
		InterfaceB interfaceB = new Child();
		interfaceB.methodB();
		
		interfaceA.methodCommon();
		interfaceB.methodCommon();
		
	}

}
