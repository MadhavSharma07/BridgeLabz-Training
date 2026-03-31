package reflection;

import java.lang.reflect.Method;

public class InvokePrivateMethodUsingReflection {

	public static void main(String[] args) throws Exception {
		Calculator calc = new Calculator();
		Class<?> cl= calc.getClass();
		
		Method methods  = cl.getDeclaredMethod("multiply",int.class,int.class);
			if(methods.getName().equals("multiply")) {
				methods.setAccessible(true);
				int result=(int)methods.invoke(calc,5,2);
				System.out.println("Multiplication Result -> "+result);
			}
		}
 
	}


class Calculator{

	private int multiply(int a, int b) {
		return a*b;
	}
}
