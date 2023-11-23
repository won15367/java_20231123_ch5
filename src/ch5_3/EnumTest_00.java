package ch5_3;

public class EnumTest_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Week today; // 열거타입변수 선언
		Week nextDay = Week.FRIDAY;
		
		today = Week.THURSDAY;
		
		System.out.println(today);
		System.out.println(nextDay);
		
		
		Score score = Score.A;
		
		System.out.println(score);
	}

}
