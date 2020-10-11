//Created by Pooja
//On 5 Oct 2019
//File explains extends keyword


import java.lang.*;
import java.io.*; 
import java.util.*;
class College
{
	String collegeName,address;
	void showCollegeDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter college name:");
		collegeName=sc.nextLine();
		System.out.println("Enter college address:");
		address=sc.nextLine();
	}
}
class Department extends College
{
	String departmentName,hodName;
	void showDepartmentDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter department name:");
		departmentName=sc.nextLine();
		System.out.println("Enter hod name:");
		hodName=sc.nextLine();	
	}
}
class FacultyMember extends Department
{
	String facultyMemberName,facultyMemberQualification;
	int noOfYearsWorked;
	void showfacultyMemberDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter faculty member name:");
		facultyMemberName=sc.nextLine();
		System.out.println("Enter faculty member qualification:");
		facultyMemberQualification=sc.nextLine();
		System.out.println("Enter no of years worked:");
		noOfYearsWorked=sc.nextInt();
	}
}
public class Test
{
	public static void main(String[]args)
	{
		FacultyMember a=new FacultyMember();
		a.showCollegeDetails();
		a.showDepartmentDetails();
		a.showfacultyMemberDetails();
	}
}