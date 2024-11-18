public class Cars {
    private String name;
    private String make;
    private double price;

public Cars (String name, String make, double price){
    this.name = name;
    this.make = make;
    this.price = price;
}

public static void main(String[] args){
    Cars car = new Cars("M5","BMW",150000.60);
    System.out.println("Car model : "+ car.name);
    System.out.println("Brand : "+ car.make);
    System.out.println("Price : "+ car.price);
}
}