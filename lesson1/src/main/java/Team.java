public class Team {
    String teamName;
    Animal[] teamMembers = new Animal[4];

    public Team(String teamName, Animal[] teamMembers) {
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public String getTeamName(){
        return "Команда: " + teamName;
    }

    public Animal[] getTeamMembers() {
        return teamMembers;
    }

    public void showResults(){
        for (Animal c : teamMembers) {
            c.showResult();
        }
    }


    public void showMembersFinishedCource() {
        for (Animal c : teamMembers) {
            if (c.isOnDistance()){
                c.showResult();
            }
        }
    }
}
