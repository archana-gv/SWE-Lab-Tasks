package student;
import java.util.*;
public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c=new Course();
		c.getdata1();
		Department d=new Department();
		d.getdata2();
		c.display();		
	}

}
class Student
{
	String s_name,usn,stu[][],course;
	void getdata()
	{
		System.out.println("Enter the name of the student \n");
		Scanner input=new Scanner(System.in);
		s_name=input.next();
		System.out.println("Enter the usn \n");
		Scanner input1=new Scanner(System.in);
		usn=input1.next();
		System.out.println("Enter the course you want \n");
		Scanner input2=new Scanner(System.in);
		course=input2.next();
			
	}
}
class Faculty
{
	String f_name,f_id;
	void info()
	{
		System.out.println("Enter the name of the faculty \n");
		Scanner input=new Scanner(System.in);
		f_name=input.next();
		System.out.println("Enter the f_id \n");
		Scanner input1=new Scanner(System.in);
		f_id=input1.next();
	}
}

class Course
{
	
	Student s=new Student();
	Faculty f=new Faculty();
	void getdata1()
	{
		s.getdata();
		f.info();
		
	}
	void display()
	{
		System.out.println("Student by name:\t"+s.s_name+"\t having usn:\t"+s.usn+"\ttaking course:"+s.course+"\tunder the faculty:\t"+f.f_name);
	}
}
class Department
{
	String dept_name;
	void getdata2()
	{
		System.out.println("Enter the department name \n");
		Scanner input=new Scanner(System.in);
		dept_name=input.next();
	}
	
	
}




