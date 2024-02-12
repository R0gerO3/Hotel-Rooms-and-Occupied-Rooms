//Rodrigo Espinoza
//Lab 7, #1
//CS/IS 112

//import scanner
//ask user how many floors does their hotel have
//use for loop---> for(initialization;boolean expression; update)
/*boolean expression-no<1 # of floors
no<10 for # of rooms on floor
# of occupied<=rooms
use while loop*/
//ask user number of rooms
// ask user # of occupents in each room
//create equation where rooms and occupied increase after each iteration
//use "continue" after 13th iteration
//create percentage variable where percentage of rooms are occupied
/*print how many rooms are in hotel
the number of rooms that are occupied
percentage of rooms occupied*/
//close scanner with try keyword

import java.util.Scanner;

public class Lab7_1
{
    public static void main(String[] args) 
    {
        int floors;
        int rooms=0;
        int roomy=0; //value user inputs
        int occupied=0;
        int occupiedy=0; //value user inputs
        double percentage;
        int count; 
        try (Scanner input = new Scanner(System.in))
        { 
            System.out.println("How many floors does your hotel have?");
            floors=input.nextInt();
            
            while (floors<1)
            {     
                System.out.println("Please enter a value greater than or equal to 1.");
                floors=input.nextInt();
            }
            for(count=1;count<=floors;count++)
            { //for loop
                if(count==13) //13th floor is skipped
                {
                    continue;
                }
                    System.out.println("How many rooms are in floor "+count+".");
                    roomy=input.nextInt();
                while(roomy<10)
                {
                    System.out.println("Please enter the number of rooms greater or equal to 10.");
                    roomy=input.nextInt();
                }
                rooms=rooms+roomy;
                    System.out.println("How many of those rooms are occupied?");
                    occupiedy=input.nextInt();
                while(occupiedy>roomy)
                {
                    System.out.println("Occupied rooms must be less than or equal to rooms open,"+
                    " please try again.");
                    occupiedy=input.nextInt();
                }
                occupied=occupied+occupiedy;
                
            } //for loop
        } //scanner closes when done
        percentage=100*(occupied/(double)rooms);
        System.out.println("The hotel has "+rooms+" rooms.");
        System.out.println(occupied+" of the Rooms are occupied.");
        System.out.printf("%.0f%% of the rooms are occupied",percentage);
    }
}