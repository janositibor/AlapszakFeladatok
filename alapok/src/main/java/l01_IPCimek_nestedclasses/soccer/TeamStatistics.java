package l01_IPCimek_nestedclasses.soccer;

import java.util.Objects;

public class TeamStatistics {
    private String teamName;
    private int points;
    private TeamDetailForStatistics teamDetailForStatistics;

    public TeamStatistics(String teamName) {
        this.teamName = teamName;
        points = 0;
        teamDetailForStatistics = new TeamDetailForStatistics();
    }

    public class TeamDetailForStatistics {
        private int played;
        private int won;
        private int tied;
        private int lost;
        private int goalsFor;
        private int goalsAgainst;

        public TeamDetailForStatistics() {
            played = 0;
            won = 0;
            tied = 0;
            lost = 0;
            goalsFor = 0;
            goalsAgainst = 0;
        }

        private int getPoints(){
            return 3*won+tied;
        }
        public int addResult(int goalsFor, int goalsAgainst){
            played++;
            this.goalsFor+=goalsFor;
            this.goalsAgainst+=goalsAgainst;
            if(goalsFor>goalsAgainst){
                won++;
            }
            else if(goalsFor<goalsAgainst){
                lost++;
            }
            else{
                tied++;
            }
            return getPoints();
        }
    }

    public void played(int plusGoalsFor, int plusGoalsAgainst){
        points+=teamDetailForStatistics.addResult(plusGoalsFor, plusGoalsAgainst);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamStatistics that = (TeamStatistics) o;
        return Objects.equals(teamName, that.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName);
    }

    public String getTeamName() {
        return teamName;
    }

    public int getPoints() {
        return points;
    }

    public int getPlayed() {
        return teamDetailForStatistics.played;
    }

    public int getWon() {
        return teamDetailForStatistics.won;
    }

    public int getTied() {
        return teamDetailForStatistics.tied;
    }

    public int getLost() {
        return teamDetailForStatistics.lost;
    }

    public int getGoalsFor() {
        return teamDetailForStatistics.goalsFor;
    }

    public int getGoalsAgainst() {
        return teamDetailForStatistics.goalsAgainst;
    }
}
