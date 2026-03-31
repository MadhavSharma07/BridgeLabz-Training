package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class ImportantMethodCustomAnnotation {  // main class
	
	public static void main(String[] args) {
		Method methods[] = Service.class.getDeclaredMethods();
		for(Method method: methods) { 
			if(method.isAnnotationPresent(ImportantMethod.class)) {
				ImportantMethod impMethod  = method.getAnnotation(ImportantMethod.class);
				System.out.println("Method -> "+method.getName());
				System.out.println("Level -> "+impMethod.level());
				System.out.println();
			}
			
		}
		

	}

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod{     // custom annotation
	String level() default "HIGH";
}


class Service{  // class having  custom annotation
	@ImportantMethod()
	public void process(){}
	
	@ImportantMethod(level="LOW")
	public void help(){}
	
	@ImportantMethod(level="MEDIUM")
	public void validate(){}
}
