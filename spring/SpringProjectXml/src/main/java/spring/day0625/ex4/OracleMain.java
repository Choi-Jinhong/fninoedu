package spring.day0625.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OracleMain {
	
	public static void main(String[] args) {
		ApplicationContext app=
				new ClassPathXmlApplicationContext("oracledb/oracleContext.xml");
		
		MyOracle my=(MyOracle)app.getBean("db");
		//System.out.println(my.toString());
		System.out.println(my); //toString으로 만든 메서드는 my만 쳐도 출력된다.
	}

}
