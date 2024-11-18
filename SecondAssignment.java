import java.util.Scanner;

public class SecondAssignment {
        private int Car1;
        private int Car2;
        private int Car3;
    
    public SecondAssignment (String CarModel, String CarBrand, double CarPrice){
    Scanner cars = new Scanner(System.in);
    System.out.println("Car1: Proton X50, Price:?");
    int car1 = cars.nextInt();
    System.out.println("Car1: Proton X90, Price:?");
    int car2 = cars.nextInt();
    System.out.println("Car1: Proton X70, Price:?");
    int car3 = cars.nextInt();

    System.out.println("Average car price :" + (car1+car2+car3)/3);
    }
}

