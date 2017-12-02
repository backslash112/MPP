package prob4;

import java.util.*;

public class Section {
	String courseName;
	int sectionNumber;
	List<TranscriptEntry> gradeSheet;
	
	public static Section createSection(int secNum, String courseName) {
		Section sect = new Section();
		sect.sectionNumber = secNum;
		sect.courseName = courseName;
		sect.gradeSheet = new ArrayList<TranscriptEntry>();
		return sect;
	}
}
