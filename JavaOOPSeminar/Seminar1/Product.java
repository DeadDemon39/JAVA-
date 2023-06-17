package Seminar1;
public class Product {

    String name;
    String brand;
    double price;  
    
    String displayInfo() {
        return String.format("%s - %s - %f",brand, name, price); 
    }
}






