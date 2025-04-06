package nl.saxion.re.sponsorrun.controllers;

public class TeamMaken {
    private String sport;
    private String team;
    private String jaar;

    public TeamMaken(String sport, String team, String jaar) {
        this.sport = sport;
        this.team = team;
        this.jaar = jaar;
    }

    public String getSport() { return sport; }
    public String getTeam() { return team; }
    public String getJaar() { return jaar; }
}
