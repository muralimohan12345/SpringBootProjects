package mvc1;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DemoController {
	Logger log=Logger.getAnonymousLogger();
	
 @ResponseBody
	@RequestMapping("/add")
	
//	public String displayadd(HttpServletRequest req,HttpServletResponse res) {
//		int result=Integer.parseInt(req.getParameter("no1"))+Integer.parseInt(req.getParameter("no2"));
//	return "sum of the numbers are "+result;
//	}
public ModelAndView displayadd(HttpServletRequest req,HttpServletResponse res) {
		log.info("inside MODEL method");
	ModelAndView mv=new ModelAndView();
	log.info("inside add method");
int result=Integer.parseInt(req.getParameter("no1"))+Integer.parseInt(req.getParameter("no2"));
mv.setViewName("display.jsp");
mv.addObject("res", result);
return mv;
}

	
@ResponseBody
@RequestMapping("/sub")
public String displaysub(HttpServletRequest req,HttpServletResponse res) {
	int result=Integer.parseInt(req.getParameter("no1"))-Integer.parseInt(req.getParameter("no2"));
return "subof the numbers are "+result;
}
}






