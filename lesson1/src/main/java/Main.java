public class Main {
    public static void main(String[] args) {

        Animal[] competitors = {new Cat("Пушок"), new Dog("Барбос"), new Cat("Мурка"), new Dog("Стрелка")};
        Obstacle[] obstacles = {new Cross(400), new Water(25)};

        Team team = new Team("Дружба", competitors);

        System.out.println(team.getTeamName());
        team.showResults();

        Course course = new Course(obstacles);
        course.doIt(team);
        System.out.println("Результаты команды:");
        team.showResults();

        System.out.println("Кто из команды прошел полосу препятствий:");
        team.showMembersFinishedCource();
    }
}
