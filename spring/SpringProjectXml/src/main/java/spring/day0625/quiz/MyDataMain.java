package spring.day0625.quiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDataMain {

	public static void main(String[] args) {
		
		ApplicationContext appQuiz=
				new ClassPathXmlApplicationContext("spring/test2/appQuiz.xml");
		
		MyData my1=(MyData)appQuiz.getBean("my1");
		my1.writeData();
		
		MyData my2=appQuiz.getBean("my2",MyData.class);
		my2.writeData();
	}

}

