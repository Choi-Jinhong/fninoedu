package spring.day0625.quiz;

public class Score {
	
	//멤버변수3개를 만든다(java, jsp, spring)
	int java, jsp, spring;
	

	//디폴트생성자
	public Score() {
		
	}
	
	//3과목을 모두 인자로 받는 생성자를 만들기 
	public Score(int java, int jsp, int spring){
		
		this.java=java;
		this.jsp=jsp;
		this.spring=spring;
		
	}

	//setter,getter 각각 받아오기
	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getJsp() {
		return jsp;
	}

	public void setJsp(int jsp) {
		this.jsp = jsp;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}
	
	

	
	
	

}
