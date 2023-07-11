package com.transfer;
import java.util.*;

public class StudentBO 
{
	List<StudentVO> stud;
	
	public StudentBO()
	{
		stud = new ArrayList<StudentVO>();
		StudentVO s1 = new StudentVO("Habi",18);
		StudentVO s2 = new StudentVO("Prabhu",11);
		
		stud.add(s1); stud.add(s2);
	}
	
	public StudentVO getstudent(int rn)
	{
		return stud.get(rn);
	}
	
	public List<StudentVO> getallstudents()
	{
		return stud;
	}
}
