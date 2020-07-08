package spring.day0626.ex1;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormDataController {
	
	@GetMapping("myform") //매핑주소는 index에서 링크하므로 이름이 동일해야 함
	public String form1()
	{
		return "form1";
	}
	
	@GetMapping("/read1")
	//@RequestMapping("/read1") --> 생략하면 get매핑
	//get방식 폼 전송
	public ModelAndView read1(@RequestParam("name") String name,
		 @RequestParam int age,
		 @RequestParam(value="msg",defaultValue = "Happy~")String msg)
	{
		ModelAndView model=new ModelAndView();
		model.addObject("name", name);
		model.addObject("age", age);
		model.addObject("msg", msg);
		
		//포워드
		model.setViewName("process1");	
		return model;
	}
	
	@PostMapping("read2")
	public ModelAndView read2(@ModelAttribute TestDTO dto)  //dto를 한 번에 모두 받아옴=@
	{
		ModelAndView model=new ModelAndView();
		//request받은 값을 dto로 받아온다
			
		model.addObject("dto", dto);
	
		//포워드
		model.setViewName("process2");
		return model;
	}
	
	
	//3번 폼 -> Map으로 폼 데이터 읽기
	@PostMapping(value = "/read3")
	public ModelAndView read3(@RequestParam Map<String, String>map)
	{
		ModelAndView model = new ModelAndView();
		
		String blood=map.get("blood");
		String star=map.get("star");
		
		String data="혈액형은"+blood+", 별자리는"+star+"자리입니다";
		
		
		model.addObject("data", data);
		model.setViewName("process3");
		
		return model;
		
	}
	
	
	//여러개의 매핑주소를 주고자 할 때
	@RequestMapping({"/apple","/kiwi","orange"})
	public String process()
	{
		return "process4"; //포워드할 jsp이름
	}
	

}
