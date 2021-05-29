package game;

import java.util.Random;
import java.util.Scanner;

public class GuesGame{
    public static void main(String[] args) {
   	 System.out.println("Welcome !!");
   	 System.out.println("Please Enter Your Name");
   	 
   	 Scanner sc = new Scanner(System.in);
   	 String name = sc.next();
   	 System.out.println("Hello "+name);
   	 System.out.println("Shall we start ?");
   	 System.out.println("\t1. Yes");
   	 System.out.println("\t 2. No");
   	 
   	 int  beginAnswer = sc.nextInt();
   	 
   	 while(beginAnswer != 1) {
   		 
   		 System.out.println("Shall we start ?");
   		 System.out.println("\t1. Yes");
   		 System.out.println("\t 2. No");
   		 
   		 beginAnswer = sc.nextInt();

   	 }
   	 Random random = new Random();
   	 int x = random.nextInt(20)+1;
   	 System.out.println("Please Guess a Number : ");
   	 int userInput = sc.nextInt();
   	 
   	 int timesTried  = 0;
   	 boolean hasWon = false;
   	 boolean shouldFinish = false;
   	 
   	 while(!shouldFinish) {
   		 timesTried++;
   			 if(timesTried<5) {
   				 if(userInput == x) {
   					 hasWon = true;
   					 shouldFinish = true;
   				 }else if(userInput >x) {
   					 System.out.println("Guess Lower");
   					 userInput = sc.nextInt();
   				 }else {
   					 System.out.println("Guess Higher");
   					 userInput = sc.nextInt();
   				 }
   			 }else {
   				 shouldFinish = true;
   			 }
   		 
   	 }
   	 
   	 if(hasWon) {
   		 System.out.println("Congrats ! You have won in your "+timesTried+" Guess.");
   	 }else {
   		 System.out.println("Game Over !");
   		 System.out.println("The Number was "+x);
   	 }
   	 
   	 
    }
}

