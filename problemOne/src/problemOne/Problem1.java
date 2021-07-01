package problemOne;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentService();
		StudentInfo s0 = new StudentInfo(9, "rana", true, false, true, false);
		ss.st.add(s0);
		StudentInfo s1 = new StudentInfo(8, "raihan", true, true, false, false);
		ss.st.add(s1);
		StudentInfo s2 = new StudentInfo(9, "kabir", true, true, true, false);
		ss.st.add(s2);
		StudentInfo s3 = new StudentInfo(8, "shahin", true, false, true, false);
		ss.st.add(s3);
		StudentInfo s4 = new StudentInfo(8, "jahid", true, false, false, false);
		ss.st.add(s4);
		StudentInfo s5 = new StudentInfo(9, "shihab", true, false, true, false);
		ss.st.add(s5);
		StudentInfo s6 = new StudentInfo(9, "rajib", true, false, true, false);
		ss.st.add(s6);
		StudentInfo s7 = new StudentInfo(9, "foisal", true, false, true, false);
		ss.st.add(s7);
		StudentInfo s8 = new StudentInfo(8, "ridoy", true, false, true, false);
		ss.st.add(s8);
		StudentInfo s9 = new StudentInfo(8, "saddam", true, false, true, false);
		ss.st.add(s9);
		boolean y = true;
		do {
			System.out.println("Enter 1 to add Student\n2 to edit no.\n3 View");
			System.out.println("4 to delete.\n5 to overall info");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				ss.addStudent();
				break;
			case 2:
				ss.edit();
				break;
			case 3:
				ss.showInfo();
				break;
			case 4:
				ss.delete();
				break;
			case 5:
				ss.showOverAllInfo();
				break;
			default:
				System.out.println("bad input");
				break;
			}
			System.out.println("want to process more? y/n");
			String x = sc.next();
			char ch = x.charAt(0);
			if (ch == 'n')
				y = false;
		} while (y != false);
		// for(int i=0;i<3;i++) {
		// ss.addStudent();
		//
		// }
		// ss.showInfo();
	}

}
