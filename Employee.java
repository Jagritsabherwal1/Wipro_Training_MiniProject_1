package Employee;

import java.util.Scanner;
public class Employee {
public static void main(String[] args) {
int empNo[]={1001,1002,1003,1004,1005,1006,1007};
String empName[]={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
String joinDate[]={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005"," 1/1  /2000" ,"12/06/2006"};
char desigCode[]={'e','c','k','r','m','e','c'};
String dept[]={"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
		int basic[]={20000,30000,10000,12000,50000,23000,29000};
		int HRA[]={8000,12000,8000,6000,20000,9000,12000};
		int IT[]={3000,9000,1000,2000,20000,4400,10000};		
		System.out.println("Enter Employee NO.:");
		Scanner scan=new Scanner(System.in);
		int e=scan.nextInt();
		int id,i;
		for(i=0;i<7;i++)
		if(e==empNo[i])
		{
		id=(e%1000)-1;
		System.out.println("Employee details:-\n"+"Emp No.: "+empNo[id]);
		System.out.println("Emp Name: "+empName[id]);
		System.out.println("Department: "+dept[id]);
		int salary=basic[id]+HRA[id]-IT[id];		
		char dg=desigCode[id];
		switch(dg)
		{
		case 'e':
		           System.out.println("Designation: Engineer");
		           salary+=20000;
		           break;
		case 'c':
			System.out.println("Designation: Consultant");
			salary+=32000;
			break;
		case 'k':
			System.out.println("Designation: Clerk");
			salary+=12000;
			break;
		case 'r':
			System.out.println("Designation: Receptionist");
			salary+=15000;
			break;
		case 'm':
			System.out.println("Designation: Manager");
			salary+=40000;
			break;
			}
			System.out.println("Salary: "+salary);
			break;
			}
		
		if(i==7)
			System.out.println("There is no employee with empid:"+e);
	}
}

