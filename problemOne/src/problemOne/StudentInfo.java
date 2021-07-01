package problemOne;

import java.awt.List;
import java.util.Scanner;

public class StudentInfo {
	private int choosenClass;
	private String name;
	private boolean math;
	private boolean english;
	private boolean bangla;
	private double avgMarks;
	private int totalDays;
	private double totalEarnings;
	private boolean deleted;
	
	public StudentInfo() {
		super();
	}
	public StudentInfo(int choosenClass, String name, boolean math, boolean english, boolean bangla, double avgMarks,
			int totalDays, double totalEarnings) {
		super();
		this.choosenClass = choosenClass;
		this.name = name;
		this.math = math;
		this.english = english;
		this.bangla = bangla;
		this.avgMarks = avgMarks;
		this.totalDays = totalDays;
		this.totalEarnings = totalEarnings;
		
	}
	
	
	public StudentInfo(int choosenClass, String name, boolean math, boolean english, boolean bangla, boolean deleted) {
		super();
		this.choosenClass = choosenClass;
		this.name = name;
		this.math = math;
		this.english = english;
		this.bangla = bangla;
		this.deleted = deleted;
	}
	public StudentInfo(int choosenClass, String name, boolean math, boolean english, boolean bangla) {
		super();
		this.choosenClass = choosenClass;
		this.name = name;
		this.math = math;
		this.english = english;
		this.bangla = bangla;
	}
	public StudentInfo(int choosenClass, String name, boolean math, boolean english, boolean bangla, double avgMarks,
			int totalDays, double totalEarnings, boolean deleted) {
		super();
		this.choosenClass = choosenClass;
		this.name = name;
		this.math = math;
		this.english = english;
		this.bangla = bangla;
		this.avgMarks = avgMarks;
		this.totalDays = totalDays;
		this.totalEarnings = totalEarnings;
		this.deleted = deleted;
	}
	public int getChoosenClass() {
		return choosenClass;
	}
	public void setChoosenClass(int choosenClass) {
		this.choosenClass = choosenClass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMath() {
		return math;
	}
	public void setMath(boolean math) {
		this.math = math;
	}
	public boolean isEnglish() {
		return english;
	}
	public void setEnglish(boolean english) {
		this.english = english;
	}
	public boolean isBangla() {
		return bangla;
	}
	public void setBangla(boolean bangla) {
		this.bangla = bangla;
	}
	public double getAvgMarks() {
		return avgMarks;
	}
	public void setAvgMarks(double avgMarks) {
		this.avgMarks = avgMarks;
	}
	public int getTotalDays() {
		return totalDays;
	}
	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}
	public double getTotalEarnings() {
		return totalEarnings;
	}
	public void setTotalEarnings(double totalEarnings) {
		this.totalEarnings = totalEarnings;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	
	

//	public void addStudent(int choosenClass,String name,boolean math,boolean english,boolean bangla,double avgMarks,int totalDays,double totalEarnings) {
//		
//		this.choosenClass=choosenClass;
//		this.name=name;
//		this.math=math;
//		this.english=english;
//		this.bangla=bangla;
//		this.avgMarks=avgMarks;
//		this.totalDays=totalDays;
//		this.totalEarnings=totalEarnings;
//	}
//	
	
	
	

}
