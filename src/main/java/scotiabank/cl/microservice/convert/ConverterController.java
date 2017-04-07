package scotiabank.cl.microservice.convert;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import scotiabank.cl.Calculator;
import scotiabank.cl.Fibonacci;
//@Controller
@RestController
public class ConverterController {
	//@Autowired
	private Calculator Calculator;
	private Fibonacci Fibonacci;
    @RequestMapping("/ToRoman")
    public String ToRoman(@RequestParam(value="number", required=false, defaultValue="1") int number, Model model) {
    	Calculator Calculator= new Calculator();
        return  Calculator.arabicToRoman(number);
    }
    @RequestMapping("/Fibonacci")
    public List<Integer> Fibonacci(@RequestParam(value="size", required=false, defaultValue="10") int size, Model model) {
    	List<Integer> primos = new ArrayList<>();

    	Fibonacci= new Fibonacci();
    	
    	for (int i = 0; i < size; i++) {
    		primos.add(Fibonacci.fibonacci(i));    		
        }
    	return primos;
    	
    }

}
