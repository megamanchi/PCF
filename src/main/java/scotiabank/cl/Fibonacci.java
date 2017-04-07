package scotiabank.cl;

public class Fibonacci {
	public int fibonacci(int n)
	{
	    if (n>1){
	       return fibonacci(n-1) + fibonacci(n-2);  //función recursiva
	    }
	    else if (n==1) {  // caso base
	        return 1;
	    }
	    else if (n==0){  // caso base
	        return 0;
	    }
	    else{ //error
	        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
	        return -1; 
	    }
	}
}
