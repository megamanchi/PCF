package scotiabank.cl.microservice.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import scotiabank.cl.CalculatorInterface;
import scotiabank.cl.CalculatorResult;

@RestController
public class JsonConverterController {
	
	@Autowired
	CalculatorInterface calculator;
	
    @RequestMapping(value="/toRomanJsonOrXML/{number}",produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public CalculatorResult toRoman(@PathVariable(value="number", required=true) int number) {
    	CalculatorResult result = new CalculatorResult();
    	result.setOperationName("toRoman");
    	result.setResult(calculator.arabicToRoman(number));
    	return result;
    } 
	
}
