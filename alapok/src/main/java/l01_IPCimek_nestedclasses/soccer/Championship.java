package l01_IPCimek_nestedclasses.soccer;

import java.util.ArrayList;
import java.util.List;

public class Championship<list> {
    private List<TeamStatistics> leagueTable=new ArrayList<>();

    public void addGame(GameResult result){
        addResult(TeamType.HOME,result);
        addResult(TeamType.GUEST,result);
    }

    private void addResult(TeamType type,GameResult result){
        String teamName;
        int goalsFor;
        int goalsAgainst;
        if(type==TeamType.HOME){
            teamName= result.teamHome;
            goalsFor=result.goalHome;
            goalsAgainst=result.goalGuest;
        }
        else{
            teamName= result.teamGuest;
            goalsFor=result.goalGuest;
            goalsAgainst=result.goalHome;
        }
        updateStatistics(teamName, goalsFor, goalsAgainst);
    }

    private void updateStatistics(String teamName, int goalsFor, int goalsAgainst){

    }
    private TeamStatistics getTeamStatisticsByName(String teamName){
        if(teamName==null || teamName.isEmpty()){
            throw new IllegalArgumentException("Team's name mustn't be empty!");
        }
        for(TeamStatistics teamStatistics:leagueTable){
            if(teamName.equals(teamStatistics.getTeamName())){
                return teamStatistics;
            }
        }
       return null;
    }

    public static class GameResult {
        private String teamHome;
        private String teamGuest;
        private int goalHome;
        private int goalGuest;

        public GameResult(String teamHome, String teamGuest, int goalHome, int goalGuest) {
            this.teamHome = teamHome;
            this.teamGuest = teamGuest;
            this.goalHome = goalHome;
            this.goalGuest = goalGuest;
        }
    }

    public List<TeamStatistics> getLeagueTable() {
        return leagueTable;
    }
}
