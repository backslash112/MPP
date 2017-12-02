package prob4;

import java.util.*;

public class Student {
//	String stuId;
	String name;
	List<TranscriptEntry> grades;
	
	public Transcript getTranscript() {
		return new Transcript(grades, this);
		
	}
	
	public static Student createStudent(String name) {
		Student stu = new Student();
		stu.name = name;
//		stu.stuId = id;
		stu.grades = new ArrayList<TranscriptEntry>();
		return stu;
	}
	
}
