package spring.day0625.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//xml阑 烹秦辑 按眉积己
		
	ApplicationContext app2=new ClassPathXmlApplicationContext("spring/test2/appContext2.xml");
	
	Student s1=app2.getBean("stu", Student.class); //规过1
		s1.write();
		
	Student s2=(Student)app2.getBean("stu"); //规过2
	s2.write();
	}

}
