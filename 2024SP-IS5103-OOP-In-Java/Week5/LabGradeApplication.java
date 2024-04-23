import java.util.ArrayList;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class LabGradeApplication {

	static String University = "Trine University - MI";
	static String Course = "IS5103 - Object Oriented Programming in JAVA";
	static String Professor = "Abdalla Soliman";
	static String Student = "Hang Yang";

	public static void main(String[] args) {
		// 1 ArrayList to hold our lab grades
		ArrayList<Integer> arrayList = new ArrayList<>();

		arrayList.add(100);
		arrayList.add(100);
		arrayList.add(100);
		arrayList.add(100);
		arrayList.add(100);
		arrayList.add(98);
		arrayList.add(98);
		arrayList.add(98);
		arrayList.add(98);
		arrayList.add(98);

		// 2, calculate the average of the lab grades
		Double avgLabGrades = arrayList.stream().collect(Collectors.averagingInt(x -> x));
		// convert the integer to string and join all the string elements from the stream into a single string by comma
		String labGradesString = arrayList.stream().map(String::valueOf).collect(Collectors.joining(","));

		// 3, set up template to print out all lab grades, course, average lab grades
		System.out.println("University: " + University);
		System.out.println("Course: " + Course);
		System.out.println("Professor: " + Professor);
		System.out.println("Student: " + Student);
		System.out.println("Date: " + LocalDate.now());
		System.out.println("10 Lab Grades: " + labGradesString);
		System.out.println("Average of 10 lab Grades: " + avgLabGrades);
	}
}