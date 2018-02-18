package javaprogramms;

import java.util.Scanner;

public class Student 
{
	String StudentName;
	String address;
	String rollNo;
	String mobileno;
	
	public void getIfo()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter student name :-");
		StudentName = scanner.nextLine();
		System.out.println("please enter student address :-");
		address = scanner.nextLine();
		System.out.println("please enter student rollno :-");
		rollNo = scanner.nextLine();
		System.out.println("please enter student mobileno :-");
		mobileno = scanner.nextLine();
	}
	
	public void displayInfo()
	{
		System.out.println("please find below information");
		System.out.println(StudentName+" "+address+" "+rollNo+" "+mobileno);
	}
	
	public static void main(String[] args) {
		
		Student sunil = new Student();
		sunil.getIfo();
		sunil.displayInfo();
	}
	
}
