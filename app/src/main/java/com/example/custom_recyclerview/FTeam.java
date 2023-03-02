package com.example.custom_recyclerview;

public class FTeam {
    private String flag;
    private String teamName;
    private String groupName;

    public FTeam(String flag, String teamName, String groupName) {
        this.flag = flag;
        this.teamName = teamName;
        this.groupName = groupName;
    }

    public String getFlag() {
        return flag;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getGroupName() {
        return groupName;
    }
}
