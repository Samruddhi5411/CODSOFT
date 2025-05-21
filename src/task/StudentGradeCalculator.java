package task;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		
	    String subject[] = {"Math" , "CN" , "CD" , "ML" ,"OS"};
	    for(int i = 0 ; i < subject.length ; i++) {
	    	System.out.println(subject[i]);
	    }
	    int i = 0;
	    int sum = 0;
	    int marks[] = new int[5];
	  boolean  failedSubject = false;
	    for(i=0; i <marks.length;i++) {
	    	//System.out.print("Enter marks obtained in " + subject[i] + " :");
	    	
	    	    // System.out.println("Enter number out of 100");
		        // marks[i] = sc.nextInt()
//	    	     marks[i] = sc.nextInt();
//		    	 if(marks[i] < 0 && marks[i]>100 ) {
//		         System.out.println( subject[i] + " : " + (marks[i] = sc.nextInt()));
	    	  do {
	    		  System.out.println("enter marks obtained in " + subject[i] + "(0-100)");
	    		  marks[i] = sc.nextInt();
	    		  if(marks[i] < 0 || marks[i] > 100) {
	    			  System.out.println("invalid");
	    	  }
	    	  
//               
	    } while(marks[i] < 0 || marks[i] > 100);
		    	 if(marks[i] < 35) {
		    		 failedSubject = true;
		    	 }
                sum = sum + marks[i];
	    }
                
	    	System.out.println("Total Marks : " + sum);
	    	int total_marks = sum;
	    	double percentage = (total_marks/500.0)*100;
	    	System.out.printf("%.2f",percentage);
	    System.out.println();
	    System.out.print("Grade :");
	    if(failedSubject) {
	    	System.out.println("F");
	    }
	    else if(percentage >=90 && percentage <=100) {
	    	 System.out.println("O");
	     }else if(percentage>=80 && percentage <=89) {
	    	 System.out.println("A+");
	     }else if(percentage >= 70 && percentage <= 79) {
	    	 System.out.println("A");
	      }else if(percentage >= 60 && percentage <= 69) {
	    	  System.out.println("B+");
	      }else if(percentage >= 50 && percentage <=59) {
	    	  System.out.println("B");
	      }else if(percentage >= 40 && percentage <= 49) {
	    	  System.out.println("C");
	      }else if(percentage<=39 &&  percentage >=35) {
	    	  System.out.println("D");
	      }else {
	    	  System.out.println("F");
	      }
       }
 }
//	    for(int i = 1 ; i < marks.length ;i++) {
//	    	System.out.println( marks[i]);
//	    }
//	    System.out.println();
//	    int marks[]  = new int[5];
//		for(int i = 0 ; i < 5 ; i++) {
//			System.out.println(subject[i] +":"+ marks[i]);
//		}
	

