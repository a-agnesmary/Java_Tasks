package classesAndObjects;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private String city;
    private String division;
    private List<Player> playerList;

    public Team(String teamName, String city, String division, List<Player> players) {
        this.teamName = teamName;
        this.city = city;
        this.division = division;
        this.playerList = new ArrayList<>(players); 
    }

    public void playGame() {
        System.out.println(teamName + " is playing a game!");
    }

    public void hireCoach() {
        System.out.println("A new coach has been hired for " + teamName);
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
    	this.playerList = playerList;
    }


    public void displayTeamInfo() {
        System.out.println("Team: " + teamName + " | City: " + city + " | Division: " + division);
        System.out.println("Players:");
        for (Player player : playerList) {
            System.out.println("- " + player.getPlayerName());
        }
    }
}
