package spring.mvc.review;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReviewController {
	
	
	//최초 루트로 시작할시 보여지는 화면
	//@RequestMapping(value="/",method=RequestMethod.POST)
	@GetMapping("/") //시작화면이 루트
	public String sawonForm()
	{
		return "sawonForm"; //포워드할 jsp
	}
	
	@GetMapping("info") //폼의 action과 이름이 같아야
	public ModelAndView sawoninfo(@ModelAttribute SawonDto dto)
	{
		ModelAndView model = new ModelAndView();
		
		model.addObject("dto", dto);
		model.setViewName("sawonInfo"); //jsp
		
		return model;
	}

}
