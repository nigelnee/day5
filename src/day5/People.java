package day5;

public class People {
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public People(String n){
		name = n;
		
	}
	
	public People(String n ,int a){
		name = n;
		age = a;
	}
	
	public static void sayHello(){
		System.out.println("Hello");
	}
}
