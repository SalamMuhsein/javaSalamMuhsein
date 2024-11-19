import java.util.Scanner;

    
public class SecondAssignment{
    private String carmodel;
    private String carbrand;
    private double carprice;

public SecondAssignment(){

    Scanner cars = new Scanner(System.in);
    
    System.out.println("Please put your car");
    String carmodel = cars.nextLine();
    System.out.println("Please put your car brand");
    String carbrand = cars.nextLine();
    System.out.println("Price:?");
    double carprice = cars.nextDouble();
    }

    public static void main(String[] args) {
        SecondAssignment firstcar = new SecondAssignment();
        SecondAssignment secondcar = new SecondAssignment();
        SecondAssignment thirdcar = new SecondAssignment();
        double avgcarprice = (firstcar.carprice + secondcar.carprice + thirdcar.carprice)/3;
        System.out.println("the average car price is RM " +avgcarprice);
    }
}


