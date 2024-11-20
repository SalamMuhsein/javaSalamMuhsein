
//and prices then fetch the car which values above 50,000 RM and portray it in the terminal

public class FourthAssignment {

    public static void main(String[] args) {

        String [][] CarModel = new String[3][3];
        CarModel[0][0] = "viva"; CarModel[0][1] = "Saga" ; CarModel[0][2] = "Ativa"; 
        CarModel[1][0] = "Accord"; CarModel[1][1] = "Civic"; CarModel[1][2] = "City";
        CarModel[2][0] = "Vios"; CarModel[2][1] = "Corolla"; CarModel[2][2] = "Camry";
        
        int [][] Price = new int [3][3];
        Price[0][0] = 30000; Price[0][1] = 56000; Price[0][2] = 70000;
        Price[1][0] = 130000; Price[1][1] = 110000; Price[1][2] = 80000;
        Price[2][0] = 90000; Price[2][1] = 100000; Price[2][2] = 150000;
        


        for (int i=0; i<CarModel.length; i++){
            for(int j=0; j<CarModel[i].length; j++){
                System.out.print(CarModel[i][j] + " ");
            }
            System.out.println();
        }
        for (int i=0; i<Price.length; i++) {
            for (int j=0; j<Price[i].length; j++) {
                System.out.print(Price[i][j] + " ");
            }
            System.out.println();
    }
        for (int i=0; i<Price.length; i++){
            for(int j=0; j<Price[i].length; j++){
                if(Price[i][j]>50000){
                    System.out.println(" "); 
                    System.out.println(CarModel[i][j] + " ----> RM" + Price[i][j]);
                    
                }
            }
        }

        }
    }

