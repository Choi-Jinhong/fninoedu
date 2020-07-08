package spring.day0625.ex2;

public class Student {
	
	String name;
	String hp;
	
	//생성자 주입...디폴트
	public Student() {
		name="default";
		hp="010-1111-2222";
	}
	
	//생성자 주입...멤버
	public Student(String name, String hp) {
		
		this.name=name;
		this.hp=hp;
		
	}
	
	//출력메서드
	public void write()
	{
		System.out.println("name: "+name+", hp: "+hp);
	}
	

}
