package Seminar3;
import java.util.*;

public class main {
    public static void main(String[] args) {
        
        List list = new ArrayList();
        list.add(0);
        list.add("Hello");
        list.add(null);

        for (Object o : list)
            System.out.println(o);

    }
    
    
}
