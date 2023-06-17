package Seminar3;

public class Cat extends Animal {

    private  static int catCounter;

    public static int getCatCounter() {
        return catCounter;
    }

    {
        System.out.println("Initializer Cat");
        catCounter++;
    }


    public Cat(String name) {
        
        super(name, 0, 200); // ограничения для кота по плаванию и бегу
        
    }

    @Override
    void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }

    

    
}
