package mapinterface;

import java.util.Map;
import java.util.TreeMap;

class code implements Comparable<code> {
	private String SectionNo;
	private String lectureNo;

	public code(String sectionNo, String lectureNo) {
		super();
		SectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}

	public String getSectionNo() {
		return SectionNo;
	}

	public String getLectureNo() {
		return lectureNo;
	}

	@Override
	public String toString() {
		return "code [SectionNo=" + SectionNo + ", lectureNo=" + lectureNo + "]";
	}

	@Override
	public int compareTo(code o) {
		String code1 = SectionNo.concat(lectureNo);
		String code2 = o.getSectionNo() + o.getLectureNo();
		return code1.compareTo(code2);
	}

}

public class TreeMapEx {

	public static void main(String[] args) {

		Map<code, String> lectures = new TreeMap<>();
		lectures.put(new code("So1", "Lo3"), "Generics");
		lectures.put(new code("So1", "Lo1"), "File Handling");
		lectures.put(new code("So2", "Lo3"), "Oops");
		lectures.put(new code("So1", "Lo7"), "Methods");
		lectures.put(new code("So1", "Lo5"), "Loops");
		lectures.put(new code("So1", "Lo3"), "Collections");
		lectures.put(new code("So1", "Lo6"), "MultiThreading");

		for (Map.Entry<code, String> entry : lectures.entrySet()) {
			System.out.println("Key: " + entry.getKey() + "Values: " + entry.getValue());
		}

	}

}
