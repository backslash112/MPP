package prob4;

class TranscriptEntry {
	Student student;
	Section section;
	String grade;
	
	public String toString() {
		return "Student: " + student.name + "\n"
				+ "Course name: " + section.courseName + "\n"
				+ "Section number: " + section.sectionNumber + "\n"
				+ "Grade: " + grade + "\n";
	}
	
	public void newTranscriptEntry(Student s, Section sect, String grade) {
		TranscriptEntry te = new TranscriptEntry();
		te.student = s;
		te.section = sect;
		te.grade = grade;
		s.grades.add(te);
		sect.gradeSheet.add(te);
	}
	
}
