import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
//		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
//		
//	Student student=(Student)context.getBean(Student.class);
//	student.setId(101);
//	System.out.println(student);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student student = (Student) context.getBean("std");
		System.out.println(student);
	}

}
