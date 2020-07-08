package spring.day0626.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	
	@RequestMapping(value = "/happy", method=RequestMethod.GET)
	public String hello(Model model)
	{
		//Model은 request에서 데이터를 저장하기 위한 인터페이스
		//서블릿에서 코딩했던 request.setAttribute와 같다
		model.addAttribute("name", "보라돌이");
		model.addAttribute("addr", "서울구로");
		
		return "result"; //포워드(WEB-INF/day0626/result.jsp)가 생략되어 있는 것
	}
	
	@RequestMapping(value = "/hello", method=RequestMethod.GET)
	//@GetMapping("/hello.do")  --> 이럴 경우 무조건 hello.do만 가능 
	public ModelAndView hello2()
	{
		ModelAndView model=new ModelAndView();
		
		//모델에 데이터 저장
		model.addObject("sangpum","딸기");
		model.addObject("price",10000);
	
		//jsp로 포워드
		model.setViewName("result2");
		
		return model;
				
	}

}
