import java.util.Scanner;

    
class SecondAssignment{
public static void main(String[] args) {
    Scanner cars = new Scanner(System.in);
    System.out.println("Car 1: Proton X50, Price:?");
    int car1 = cars.nextInt();
    System.out.println("Car 2: Proton X90, Price:?");
    int car2 = cars.nextInt();
    System.out.println("Car 3: Proton X70, Price:?");
    int car3 = cars.nextInt();

    System.out.println("Average car price :" + (car1+car2+car3)/3);
    }
}

