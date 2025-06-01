package task;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				Random rd = new Random();
				int number = rd.nextInt(100);
		        System.out.println(number);
		        int guess_number = 0;
		        
		        while(number!= guess_number) 
		        {
				      System.out.print("Enter the number you guessed : ");
				        guess_number = sc.nextInt();
				
			       
			        	
					if(number == guess_number) {
						System.out.println("The number you guessed is correct. Congratulation! ");
						
					} else if(number > guess_number) {
						System.out.println("The number you guessed is low");
					} else {
						System.out.println("The number you guessed is high");
					}
					
			   }

			}



	}


