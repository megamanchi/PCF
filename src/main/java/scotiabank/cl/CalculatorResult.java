package scotiabank.cl;

import java.util.List;

public class CalculatorResult {

	private String operationName;
	private List<String> parmeters;
	private String result;
	
	
	public String getOperationName() {
		return operationName;
	}
	
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	
	public List<String> getParmeters() {
		return parmeters;
	}
	
	public void setParmeters(List<String> parmeters) {
		this.parmeters = parmeters;
	}
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	
	
	
}
