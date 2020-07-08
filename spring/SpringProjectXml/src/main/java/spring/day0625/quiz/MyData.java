package spring.day0625.quiz;

public class MyData {
	
	//Score, Info 클래스를 멤버변수로 선언
	Score score;
	Info info;
	
	
	//Score, Info 를 각각 주입받는 생성자 만들기
	public MyData(Score score, Info info) {
		this.score=score;
		this.info=info;
		
	}
	

	//출력메서드(writeData로 만들기)
	//출력->이름,java,jsp,spring을 출력하는 메서드
	public void writeData()
	{
		System.out.println("***결과출력***");
		System.out.println("이름: "+info.getName());
		System.out.println("나이: "+info.getAge());
		System.out.println("java점수: "+score.getJava());
		System.out.println("jsp점수: "+score.getJsp());
		System.out.println("spring점수: "+score.getSpring());
		
	}
	
	

}
