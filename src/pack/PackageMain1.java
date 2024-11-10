package pack;

import pack.a.User;

public class PackageMain1 {
	
	public static void main(String[] args) {
		Data data = new Data();
//		pack.a.User use = new pack.a.User(); // import 작성 X
		User use = new User(); //package 가 다른 것을 불러올 때 import 작성
	}

}
