import java.time.chrono.ThaiBuddhistChronology;
import java.util.Scanner;

public class ThirdAssignment{

    static int carprice = 0;
        public static void main(String[] args) {
            Scanner cars = new Scanner(System.in);
            System.out.println("please type in your car (1 = Toyota, 2 = Honda, 3 = Mitsubishi)");
            int carmodel = cars.nextInt();
            
            switch (carmodel) {
              case 1:
                  System.out.println("Toyota");
                     carprice = 80000;
              break;
            case 2:
                 System.out.println("Honda");
                carprice = 120000;
                 break;
            case 3:
              System.out.println("Mitsubishi");
              carprice = 95000;
              break;
           /* default : 
                System.out.println("invalid car")*/
        }
        System.out.println("The Price for this model is RM " +carprice);

        if (carprice > 100000){
        System.out.println("Thankyou for Your Purchase, You are now a VIP buyer !!");
        } else {
        System.out.println("Thankyou for your purchase, have a good day :)");
        }

    }
}

    



