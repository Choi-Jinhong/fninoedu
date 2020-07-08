package spring.day0626.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ScoreController {
	
	@GetMapping("mymyform")
	public String form2()
	{
		return "form2";
	}
	
	@PostMapping("read5")
	public ModelAndView read5(@ModelAttribute ScoreDTO dto)
	{
		ModelAndView model=new ModelAndView();
		
		model.addObject("dto", dto);
		
		model.setViewName("score");
		return model;
		
	}

}
