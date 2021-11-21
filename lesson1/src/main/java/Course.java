public class Course {
    Obstacle[] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        Animal[] teamMembers = team.getTeamMembers();
        if (teamMembers.length > 0){
            for (Animal c : teamMembers) {
                for (Obstacle o : obstacles) {
                    o.doIt(c);
                    if (!c.isOnDistance()) break;
                }
            }
        } else {
            System.out.println("Нет ни одного члена команды");
        }
    }
}
