package com.pak;

public class Abstrats2 extends Abstrats {

	void welcomeAttendance() {

		System.out.println("welcomeTeacher");
	}

	void welcomeAttendance1() {

		System.out.println("welcome");
	}

	void welcomeAttendance2() {
		System.out.println("Teacher");

	}

	public static void main(String[] args) {

	

		Abstrats[] abstrats = new Abstrats[4];
		abstrats[0] = new Abstrats2();
		abstrats[1] = new Abstrats2();
		abstrats[2] = new Abstrats3();
		abstrats[3] = new Abstrats3();
		
		for (Abstrats abstrats3 : abstrats) {
			abstrats3.welcomeAttendance();
			abstrats3.welcomeAttendance1();
			abstrats3.welcomeAttendance2();
			
			
		}
	}
}
