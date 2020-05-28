package other;

public class ScoreO {

	private int kor;
	private int eng;
	
	public ScoreO(int kor, int eng) {
		super();
		this.kor = kor;
		this.eng = eng;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void showScore() {
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
	}
	
	@Override
	public String toString() {
		return "Score [kor=" + kor + ", eng=" + eng + "]";
	}
	
}