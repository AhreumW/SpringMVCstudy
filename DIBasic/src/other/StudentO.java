package other;

import other.ScoreO;

public class StudentO {

	String name;
	ScoreO scoreO;	//has관계 - student클래스는 score클래스를 가진다.
	
	// Student 클래스는 Score 클래스에 *의존*한다.
	// 의존성을 주입한 형태 (new한 적이 없다,외부유입)
	public StudentO(ScoreO scoreO) {	//=> injection 주입
		//student는 score을 사용한다. 
		//-> Score없이는 Student를 만들 수 없다. => dependency	
		this.scoreO = scoreO;
	}
	
	public void setScoreO(ScoreO scoreO) {
		this.scoreO = scoreO;
	}
	
	public void showStudent() {
		System.out.println("DI 버전");
		System.out.println("이름은 "+ name);
		scoreO.showScore();
	}
	
	
}
