package ch6_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		stu1.name = "홍길동";
		stu1.age = 10;
		
		stu2.name = "김유신";
		stu2.age = 11;
		
		
		Car car1 = new Car();
		
		System.out.println(car1.speed);
		car1.printSpeed();
		System.out.println(car1.speed);
	}

}
