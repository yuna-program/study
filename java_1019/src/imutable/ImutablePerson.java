package imutable;

public class ImutablePerson {
	
	private final String name;
	private final int age;
	
//	public ImutablePerson withName() {
//	}
	
	public ImutablePerson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
