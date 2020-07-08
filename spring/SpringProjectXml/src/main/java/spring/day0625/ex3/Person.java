package spring.day0625.ex3;

public class Person {
	PersonData data; //클래스를 가져와 멤버로
	
	public Person(PersonData data) {
		super();
		this.data=data;
	}
	
	//출력문메소드
	public void writeData()
	{
		System.out.println("사원명: "+data.getSawonname());
		System.out.println("급여: "+data.getPay());
		System.out.println("입사일: "+data.getIpsaday());
		
	}

}
