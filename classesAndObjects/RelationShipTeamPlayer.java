package classesAndObjects;

import java.util.ArrayList;
import java.util.List;

public class RelationShipTeamPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player1 = new Player("Rohit Sharma", "Batsman", 45);
        Player player2 = new Player("Virat Kohli", "Batsman", 18);
        Player player3 = new Player("Jasprit Bumrah", "Bowler", 93);
        Player player4 = new Player("Ravindra Jadeja", "All-rounder", 8);
        Player player5 = new Player("KL Rahul", "Wicketkeeper", 1);
        

        List<Player> playerList = new ArrayList<>();
        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
        playerList.add(player4);
        playerList.add(player5);

        Team team = new Team("India", "Mumbai", "ODI", playerList);

        team.displayTeamInfo();
	}

}

