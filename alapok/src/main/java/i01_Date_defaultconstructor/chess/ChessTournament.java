package i01_Date_defaultconstructor.chess;

import java.util.Arrays;
import java.util.List;

public class ChessTournament {
    List<Team> teams;

    public ChessTournament() {
        teams = Arrays.asList(new Team(), new Team(), new Team());
    }

    void addPlayersToTeams(List<Player> playersRegistrated){
        Team team;
        for(int i=1; i<=6; i++){
            if(i>playersRegistrated.size()){
                break;
            }
            setPlayersIntoTeam(i,playersRegistrated.get(i-1));
        }
    }
    void setPlayersIntoTeam(int i,Player player){
        if(i%2==1){
            Team team=teams.get((i-1)/2);
            team.setPlayerOne(player);
        }
        else{
            Team team=teams.get((i-2)/2);
            team.setPlayerTwo(player);
        }
    }

    public List<Team> getTeams() {
        return teams;
    }
}
