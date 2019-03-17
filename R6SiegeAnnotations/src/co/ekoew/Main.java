package co.ekoew;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings({ "deprecation", "unused" })
public class Main {

	public static void main(String[] args) {
		
		//Application Context
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Operator op1 = (Operator)context.getBean("ops1");
		System.out.println("Operator1 Details: "+op1);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
	}
}
