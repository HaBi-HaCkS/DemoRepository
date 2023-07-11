package com.transfer;

public class TransferPattern 
{

	public static void main(String[] args)
	{
		StudentBO stud1 = new StudentBO();
		
		for(StudentVO s1 : stud1.getallstudents())
		{
			System.out.println("Roll No : " +s1.getRollno() + "Name : "+ s1.getName());
		}
		StudentVO svo = stud1.getstudent(1);
		System.out.println("Roll No : " +svo.getRollno() + "Name : "+ svo.getName());
		
	}

}
