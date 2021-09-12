/*
Assignment 2.3 - CIS505 - Kylie Gregory 9/12/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/ 

public class Team {
    private String teamName = ""; //specifies the teams name.
    private String[] players = new String[20]; //specifies the players assigned to a team.
    private int playerCount = 0; //specifies the number of players on a team.

    public Team(String currentTeamName) {
    }

    public Team(String teamName) { //An argument constructor that creates a team. 
        this.teamName = teamName;
    }

    public void addPlayer(String player) { //adds a player to the players data field. 
        players[playerCount] = player;
        playerCount++;
    }
    public String[] getPlayers() { //returns the players data field.
        return players;
    }
    public int getPlayerCount() { //returns the playerCount data field.
        return playerCount;
    }
    public String getTeamName() { //returns the teamName data field.
        return teamName;
    }//end main
}//end Team class