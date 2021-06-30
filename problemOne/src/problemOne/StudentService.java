package problemOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
	List<StudentInfo> st = new ArrayList<StudentInfo>();
	Scanner sc = new Scanner(System.in);
	int tDays = 0;
	int clss8Days = 0;
	int clss8Earnings = 0;
	int clss9Days = 0;
	int clss9Earnings = 0;
	int clss10Days = 0;
	int clss10Earnings = 0;
	int tEarnings = 0;
	int count = 0;
	int totalMarks = 0;
/*
 * this method is for adding the studnet information
 */
	public void addStudent() {
		System.out.println("Choose a class:");
		int choosenClass = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a name: ");
		String name = sc.nextLine();
		System.out.println("choose math: if yes type y, if no type n");
		String m = sc.nextLine();
		System.out.println("choose bangla: if yes type y, if no type n");
		String b = sc.nextLine();
		System.out.println("choose english: if yes type y, if no type n");
		String e = sc.nextLine();

		double avgMarks = 0;
		int totalDays = 0;
		double totalEarnings = 0;
		boolean math = false, bangla = false, english = false;
		if (m.equals("y")) {
			math = true;
		}
		if (b.equals("y")) {
			bangla = true;
		}
		if (e.equals("y")) {
			english = true;
		}

		StudentInfo s = new StudentInfo(choosenClass, name, math, english, bangla, avgMarks, totalDays, totalEarnings,
				false);
		st.add(s);

		System.out.println("new information has been added");
	}

	/*
	 * this method is for showing information of selected class
	 */
	public void showInfo() {
		System.out.println("Enter class: ");
		int clss = sc.nextInt();
		st.forEach((student) -> {
			if (!student.isDeleted() && student.getChoosenClass() == clss) {
				System.out.println(
						"Class: " + student.getChoosenClass() + "| Name: " + student.getName() + "| total Earnings: "
								+ student.getTotalEarnings() + "| Average Marks" + student.getAvgMarks());

			}
		});
		System.out.println("\n\nDo you want to see specific info? y/n");
		String yn = sc.nextLine();
		if (yn.equals("y")) {
			System.out.println("Enter Name: ");
			String name = sc.nextLine();
			showSpecificInfo(name);
		}

	}

	/*
	 * this method is for specific student information which is called from showInfo
	 * method while user want to see specific student informations in details
	 */
	public void showSpecificInfo(String name) {

		st.forEach((student) -> {
			if (!student.isDeleted() && student.getName().equals(name)) {
				System.out.println("Class: " + student.getChoosenClass() + "| Name: " + student.getName() + "| Math: "
						+ student.isMath() + "| Bangla: " + student.isBangla() + "| English: " + student.isEnglish()
						+ "| Average Marks" + student.getAvgMarks() + "| Total Days" + student.getTotalDays()
						+ "| total Earnings: " + student.getTotalEarnings());

			}
		});
	}

	/*
	 * this method is for: a. The total days taught across all classes b. Individual
	 * days taught in each class c. Total earnings d. Individual earnings of each
	 * class e. Individual earnings of each subject f. Average marks of all students
	 */
	public void showOverAllInfo() {
		st.forEach((student) -> {
			count++;
			tDays += student.getTotalDays();
			if (student.getChoosenClass() == 8) {
				clss8Days += student.getTotalDays();
				clss8Earnings += student.getTotalEarnings();
			}
			if (student.getChoosenClass() == 9) {
				clss9Days += student.getTotalDays();
				clss9Earnings += student.getTotalEarnings();
			}
			if (student.getChoosenClass() == 10) {
				clss10Days += student.getTotalDays();
				clss10Earnings += student.getTotalEarnings();
			}
			tEarnings += student.getTotalEarnings();
			totalMarks += student.getAvgMarks();
		});
		int totalAvgMarks = totalMarks / count;
		System.out.println("a. The total days taught across all classes: " + tDays);
		System.out.println("b. Individual days taught in each class: Class 8=" + clss8Days + ", Class 9=" + clss9Days
				+ ", Class 10=" + clss10Days);
		System.out.println("c. Total earnings: " + tEarnings);
		System.out.println("d. Individual earnings of each class: Class 8 : " + clss8Earnings + ", Class 9: "
				+ clss9Earnings + ", Class 10: " + clss10Earnings);
		System.out.println("f. Average marks of all students: "+totalAvgMarks);
		
	}

	/*
	 * this method is for update selected student information need to input name
	 */
	public void edit() {
		System.out.println("Enter name to change data: ");
		String name = sc.nextLine();
		System.out.println("Enter number of days: ");
		int daysTotal = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		sc.nextLine();

		st.forEach((student) -> {
			if (student.getName().equals(name)) {
				int totalEarnings = 0;
				student.setTotalDays(daysTotal);
				if (student.isMath())
					totalEarnings += daysTotal;
				if (student.isBangla())
					totalEarnings += daysTotal;
				if (student.isEnglish())
					totalEarnings += daysTotal;
				student.setTotalEarnings(totalEarnings);
				student.setAvgMarks(marks);
			}
		});
		System.out.println("Information updated.");
	}

	/*
	 * this method is for delete information from the list not showing the
	 * information
	 */
	public void delete() {
		System.out.println("Enter name to delete data: ");
		String name = sc.nextLine();
		st.forEach((student) -> {
			if (student.getName().equals(name))
				student.setDeleted(true);
		});
		System.out.println("Information deleted");

	}

}
