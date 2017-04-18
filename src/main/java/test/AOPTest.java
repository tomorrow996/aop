package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.AService;

public class AOPTest{
	public static void main(String[] args){
		BeanFactory factory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		AService aService = (AService)factory.getBean("aService");
		aService.cool();
		aService.cool("张冲");
	}
}