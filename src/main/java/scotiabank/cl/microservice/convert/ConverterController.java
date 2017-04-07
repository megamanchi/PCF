package scotiabank.cl.microservice.convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import scotiabank.cl.CalculatorInterface;

@Controller
public class ConverterController {
	@Autowired
	private CalculatorInterface calculator;
	
    @RequestMapping("/ToRoman")
    public String ToRoman(@RequestParam(value="number", required=false, defaultValue="1") int number, Model model) {
    	model.addAttribute("number", calculator.arabicToRoman(number));
        return  "ToRoman";
    }
       
}
