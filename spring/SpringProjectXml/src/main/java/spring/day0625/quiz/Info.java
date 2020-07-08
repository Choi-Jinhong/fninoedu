package spring.day0625.quiz;

public class Info {
	
	//멤버변수 이름, 나이로 만든다
	private String name;
	private String age;
	
	//디폴트생성자
	public Info() {
		
	}
	
	//이름, 나이를 인자로 받는 생성자 만든다
	Info(String name, String age){
		this.name=name;
		this.age=age;
		
	}
	
	//setter, getter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	
	

}
