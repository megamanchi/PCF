package scotiabank.cl;

public class Calculator {	
	private String[][]  matriz = {
			 {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
			 {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}, 
			 {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
			 {"", "M", "MM", "MMM", "_IV", "_V", "_VI", "_VII", "_VIII","_IX"}};
	
	public String arabicToRoman(int x)
	{		
		int length = 4;	
		String res="";
		int div= 1000;	
		int mod= x%1000;			
		for ( int factor = 1; factor <= length; factor ++ ) {
			if (factor==1)
			res =res.concat(matriz[length-factor][(x/div)]);	
			else
			res =res.concat(matriz[length-factor][(mod/div)]);			
			mod= mod%div;	
			div=div/10;
		}
		return 	res;
	}
}
