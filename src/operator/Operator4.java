package operator;

public class Operator4 {
	public static void main(String[] args) {
	// 증감 연산자 
	
	int a = 0;
	
	a++; 
	a = a + 1;// 자기 자신에게 1을 더하고 다시 대입해준다 
	
	++a; // 변수에 들어있는 숫자값을 1증가시킨다 > 이후 연산
	
	a++; // 
	
	// 전위 증감 연산자 ( 증감 연산을 수행하고 다른 연산을 수정함 ) 
	
	int b = 1;
	int c = 0;
	
	c = ++b;
	
	b = 1;
	c = 0;
	
	c = b++; // b의 현재 값을 c에 먼저 대입연산하고 그 이후에 값을 1증가시킴 
	
	}

}
