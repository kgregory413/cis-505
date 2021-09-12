/*
Assignment 2.3 - CIS505 - Kylie Gregory 9/12/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/ 

import java.util.Scanner;

public class TestSportsTeamApp {
    public static void main(String[] args) {
        System.out.println("  Welcome to the Sports Team App");
        while (true)
        {
            Scanner teamNameScnrObj = new Scanner(System.in); // Creates a Scanner object
            System.out.println("  Enter a team name: "); // Prompts the user to enter the team and player names.
            String teamName = teamNameScnrObj.nextLine(); // Reads user input
            Team st = new Team(teamName); //Uses the inputted values to create a new instance of the Team class.
            System.out.println("  Enter the players names:\n    hint:use commas for multiple players; no spaces>: "); // Prompts user for player names
            String teamPlayers = teamNameScnrObj.nextLine(); // Reads value as input
            String[] teamPlayersArray= teamPlayers.split(","); // Converts the user entered players string into an array of players. 
            for(int i=0;i<=teamPlayersArray.length-1;i++) // For loop for iteration
            {
                st.addPlayer(teamPlayersArray[i]); // Invoke addPlayer method
            }
            
            System.out.println("  --Team Summary--");
            System.out.println("  Number of players in team: "+st.getPlayerCount()); // prints the player names
            System.out.println("  Players on team: "+st.getPlayers()); // prints the number of players on the team
            System.out.println("  Continue? (y/n): "); // Prompts users to continue or exit
            String continueFlag = teamNameScnrObj.nextLine();
            if(continueFlag.equals("n")) // if user enters "n," the program ends
            System.out.println("  End of line... ");
            break;
            }
        } //end while loop
    } //end TestSportsTeamApp
