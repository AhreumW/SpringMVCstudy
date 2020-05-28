package kr.tg.bna;

public class Student {

	private String name;
	private Score score;	 
	
	// Student 클래스는 Score 클래스에 *의존*한다.
	// 의존성을 주입한 형태 (new한 적이 없다,외부유입)
	public Student(Score score) {	//=> injection 주입
		this.score = score;		//=> dependency	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}

	public void showStudent() {
		System.out.println("DI 버전");
		System.out.println("이름은 "+ name);
		score.showScore();
	}
	
	
}
