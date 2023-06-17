package Seminar3;

public abstract class Animal {

    protected String name;
    protected int maxSwim;
    protected int maxRun;
    private int id;
    public static int identifier = 0;
    
    
    public String getName() {
        return name;
    }
    public int getMaxSwim() {
        return maxSwim;
    }
    public int getMaxRun() {
        return maxRun;
    }        
    public int getId() {
        return id;
    }


    public Animal(String name, int maxSwim, int maxRun) {
        id = ++identifier;
        this.name = name;
        this.maxSwim = maxSwim;
        this.maxRun = maxRun;
    }

    
    void run(int distance) {
        if (distance <= maxRun) {
            System.out.printf("%s пробежал %d метров\n", name, distance);
        } else System.out.printf("%s не смог пробежать %d метров\n", name, distance);
    }

    void swim(int distance) {
        if (distance <= maxSwim) {
            System.out.printf("%s проплыл %d метров\n", name, distance);
        } else System.out.printf("%s не смог проплыть %d метров\n", name, distance);
    }
}

    

