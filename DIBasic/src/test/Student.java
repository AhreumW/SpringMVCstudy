package test;

import test.Score;

public class Student {

	String name;
	Score score;	//has관계 - student클래스는 score클래스를 가진다.
	
	// Student 클래스는 Score 클래스에 *의존*한다.
	public Student() {
		//student는 score을 사용한다. 
		//-> Score없이는 Student를 만들 수 없다. = dependency	
		score = new Score(100, 90);		//그러나 여기서 injection은 적용되지 않음
	}
	
	/*
	//이것은 injection을 적용했다고 할 수 있으나 * 객체지향적이지 못하다. *
	// : 학생에 학생에 대한 정보를 넣어햐지 다른 객체 점수에 대한 정보를 넣는다는 것은 이미 객체지향을 잊어버린 것이다.
	public Student(int a, int b) {
		//student는 score을 사용한다. 
		//-> Score없이는 Student를 만들 수 없다. = dependency	
		score = new Score(a, b);		
	}
	*/
	
	public void showStudent() {
		System.out.println("D 버전");
		System.out.println("이름은 "+ name);
		score.showScore();
	}
	
	
}
