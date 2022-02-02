package com.oops.classmethod;

class Employee{

	public static final int ISFULLTIME=1; 
	public static final int ISPARTTIME=0;
	static int dayPresent = 0; 
	static int totalHour = 0;  ; 
	static int monthlyWage = 0;

	void method1(){

		
		int empHour = 0; 

		for(int i=1;i<31;i++) {
			if (dayPresent < 20 && totalHour < 100)
			{

				int EmpCheck = (int) (Math.floor(Math.random() * 10) % 3);

				if(EmpCheck==ISFULLTIME)
					empHour=8;
				else if(EmpCheck==ISPARTTIME)
					empHour=4;
				else
					empHour=0;
				dayPresent += 1;
				totalHour += empHour;
			}


		}



		System.out.println("working day "+dayPresent);
		System.out.println("total hour worked "+totalHour);
		monthlyWage = totalHour * 20;
		System.out.println("monthly salary is "+monthlyWage);


	}
}

public class EmpWegeCond{
	public static void main(String[] args) {
		Employee ob1=new Employee();
		ob1.method1();

	}
}





