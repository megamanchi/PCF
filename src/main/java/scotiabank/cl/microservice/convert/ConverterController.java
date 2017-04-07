package scotiabank.cl.microservice.convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import scotiabank.cl.Calculator;

@Controller
public class ConverterController {
	//@Autowired
	private Calculator Calculator;
    @RequestMapping("/ToRoman")
    public String ToRoman(@RequestParam(value="number", required=false, defaultValue="1") int number, Model model) {
    	Calculator Calculator= new Calculator();
    	model.addAttribute("number", Calculator.arabicToRoman(number));
        return  "ToRoman";
    }

}
