package kr.tg.bna;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {

//		Score score1 = new Score(100, 90);
//		Student student1 = new Student(score1);
//		
//		student1.name = "환상";
//		student1.showStudent();
		
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/spring-context.xml");
		
		Student stu = ctx.getBean("student", Student.class);
		
//		stu.name = "환상";
		stu.showStudent();
		
		//getter setter가 없으면 bean은 돌아가지않는다.
		
		
		
	}

}
