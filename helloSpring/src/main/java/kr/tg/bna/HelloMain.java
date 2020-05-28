package kr.tg.bna;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {
	
	public static void main(String[] args) {
		HelloDao helloDao = new HelloDao();
		
		int result = helloDao.addTwoNumber(3, 5);
		
		System.out.println(result);
		
		// 이것이 스프링 방식
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-context.xml");
		
		//sprint-context.xml에 적어둔 <bean> 태그에서 불러온다. 
		HelloDao dao = ctx.getBean("helloDao", HelloDao.class);
		
		result = dao.addTwoNumber(5, 67);
		
		System.out.println(result);		
		
		
		// 이것이 스프링 방식
		//sprint-context.xml에 적어둔 <bean> 태그에서 불러온다. 
		Calc calcDao = ctx.getBean("calc", Calc.class);
		
		result = calcDao.subTwoNumber(5, 67);
		
		System.out.println(result);
		
		
	}
	
}
