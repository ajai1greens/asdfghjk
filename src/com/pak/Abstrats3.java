package com.pak;

public class Abstrats3 extends Abstrats {


	void welcomeAttendance() {
	System.out.println("welcomeStudent");
		
	}

	
	void welcomeAttendance1() {
		
		System.out.println("Student");	
	}


	void welcomeAttendance2() {
		System.out.println("welcome");
	}
public static void main(String[] args) {
	Abstrats3 abstrats3 = new Abstrats3();
	abstrats3.welcomeAttendance();
	abstrats3.welcomeAttendance1();
	abstrats3.welcomeAttendance2();
}
}
