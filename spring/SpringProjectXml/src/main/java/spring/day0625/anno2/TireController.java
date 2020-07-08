package spring.day0625.anno2;



import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("TIRECONT")
public class TireController {
	
	//@Autowired	
	@Resource(name = "canadaTire")
	Tire tire;
	public void process()
	{
		String s=tire.getTire();
		System.out.println(s);				
	}
}
