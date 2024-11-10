package java_1020;

import java.util.ArrayList;
import java.util.List;

public class A6 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		System.out.println(list);
		
		int voIdIndx = list.indexOf("void");
		System.out.println(voIdIndx);
	}

}
