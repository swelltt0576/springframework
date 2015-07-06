package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * 测试用例
 * 
 * @author wxu
 * 
 */
@Controller
public class HelloWorldController {

	private static Logger logger = LoggerFactory
			.getLogger(HelloWorldController.class);

	@RequestMapping("/helloWorld.do")
	public String helloWorld(Model model) {

		logger.info("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		model.addAttribute("message", "Hello World!");
		return "helloWorld";
	}
}
