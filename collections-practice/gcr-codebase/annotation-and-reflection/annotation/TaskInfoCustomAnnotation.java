package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class TaskInfoCustomAnnotation {  // main class

	public static void main(String[] args) {
		Method methods[] = TaskManager.class.getDeclaredMethods();
		for(Method method: methods) {
			if(method.isAnnotationPresent(TaskInfo.class)) {
				TaskInfo info = method.getAnnotation(TaskInfo.class);
				System.out.println("Method -> "+method.getName());
				System.out.println("Priority -> " +info.priority());
				System.out.println("Assigned To -> " +info.assignedTo());
				System.out.println();
			}
		}
		
	}

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo{  // custom annotation
	int priority();
	String assignedTo();
	
	
}

class TaskManager{  // Task manager class
	@TaskInfo(priority=1,assignedTo="Sarthak")
	public void completeTask() {
//		System.out.println("Completed Task");
	}
	@TaskInfo(priority=2,assignedTo="Shivam")
	public void reviewTask() {
//		System.out.println("Reviewed Task");
	}
	
	@TaskInfo(priority=0,assignedTo="Aditya")
	public void pendingTask() {
		System.out.println("Pending Task");
	}
	
}
