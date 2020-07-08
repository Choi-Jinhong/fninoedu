package spring.day0625.anno2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TireMain {

	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("oracledb/annoContext.xml");
		
		//getBean의 name은 생략하면 클래스명으로 가져오고 아니면 명확한 이름으로 가져온다
		//생략할시엔 tireController
		
		
		TireController tc=(TireController)app.getBean("TIRECONT");
		tc.process();

	}

}
