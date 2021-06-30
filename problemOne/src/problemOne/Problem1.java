package problemOne;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentService();
		  boolean y=true;  
		     do{   
		         System.out.println("Enter 1 to add Student\n2 to edit no.\n3 View");
		         System.out.println("4 to delete");
		         System.out.println("enter your choice");
		         int choice=sc.nextInt();
		         switch(choice)
		         {
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
		                
		                break;
		            default:
		                System.out.println("bad input");
		                break;
		        }
		        System.out.println("want to process more? y/n");
		        String x=sc.next();
		        char ch=x.charAt(0); 
		        if( ch=='n')
		            y=false;
		    }
		    while(y!=false);
//		for(int i=0;i<3;i++) {
//			ss.addStudent();
//			
//		}
//		ss.showInfo();
	}

}
