public class Animal {
    String type;
    String name;
    int maxRunDistance;
    int maxSwimDistance;
    boolean onDistance;

    public boolean isOnDistance() {
        return onDistance;
    }

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance, boolean onDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    public void run(int length) {
        if (maxRunDistance >= length) {
            System.out.println(type + " " + name + " успешно пробежал кросс");
        } else {
            System.out.println(type + " " + name + " не смог пробежать кросс");
            onDistance = false;
        }
    }

    public void swim (int length) {
        if (maxSwimDistance >= length) {
            System.out.println(type + name + " " + " успешно проплыл дистанцию");
        } else {
            System.out.println(type + name + " " + " не смог проплыть дистанцию");
            onDistance = false;
        }
    }

    public void showResult(){
        System.out.println(type + " " + name + ":" + onDistance);
    }
}

