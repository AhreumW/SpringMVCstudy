package other;

public class StudentOTest {

	public static void main(String[] args) {
		
		//각 클래스 내부는 변경하지 않는다. = 분리설계가 잘 되었다.
		//스프링인 이런 점이 잘 되어있다. 
		
		ScoreO scoreO1 = new ScoreO(100, 90);
		StudentO studentO1 = new StudentO(scoreO1);
		
		studentO1.name = "환상";
		studentO1.showStudent();
		
		ScoreO scoreO2 = new ScoreO(90, 90);
		StudentO studentO2 = new StudentO(scoreO2);
		
		studentO2.name = "지원";
		studentO2.showStudent();
		
		ScoreO scoreO3 = new ScoreO(95, 100);
		StudentO studentO3 = new StudentO(scoreO3);
		
		studentO3.name = "제건";
		studentO3.showStudent();
		
	}

}
