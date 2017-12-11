import java.util.*;

class Main {
    public static void main(String[] args) {
        FileOp.getCars();

        while(true) {
            System.out.println("All cars:");
            for(Car c : Car.getAllCars()) System.out.println(c);

            System.out.println("(1) Search Cars");
            System.out.println("(2) Add Car");
            System.out.println("(3) Delete Car");
            System.out.println("(4) Exit System");

            Scanner scn = new Scanner(System.in);
            int choice = scn.nextInt();
            scn.nextLine();

            if(choice == 1) {
                while(true) {
                    System.out.println("Car searching options:");
                    System.out.println("\t(1) by Registration Number");
                    System.out.println("\t(2) by Car Make and Car Model");
                    System.out.println("\t(3) back to Main Menu");

                    int searchChoice = scn.nextInt();
                    scn.nextLine();

                    if(searchChoice == 1) {
                        System.out.printf("Enter Registration Number: ");
                        String regNumber = scn.nextLine();
                        if(regNumber.equals("")) regNumber = Car.invalidVal;

                        System.out.println("Search Results:");
                        List<Car> myCars = Car.searchCars(regNumber, Car.invalidVal, Car.invalidVal);
                        for(Car c : myCars) System.out.println(c);
                    }
                    else if(searchChoice == 2) {
                        System.out.printf("Enter Car Make: ");
                        String carMake = scn.nextLine();
                        if(carMake.equals("")) carMake = Car.invalidVal;

                        System.out.printf("Enter Car Model (If you're John Snow, write 'ANY' without commas): ");
                        String carModel = scn.nextLine();
                        if(carModel.equals("ANY")) carModel = Car.invalidVal;

                        System.out.println("Search Results:");
                        List<Car> myCars = Car.searchCars(Car.invalidVal, carMake, carModel);
                        for(Car c : myCars) System.out.println(c);
                    }
                    else if(searchChoice == 3) {
                        break;
                    }
                    else continue;
                }
            }
            else if(choice == 2) {
                System.out.println("Add in this format: regNumber,yearMade,color1,color2,color3,carMake,carModel,price");
                String carInfo = scn.nextLine();
                Car curCar = new Car(carInfo, ",");
                curCar.addCar();
            }
            else if(choice == 3) {
                String regNumber = scn.nextLine();
                if(regNumber.equals("")) regNumber = Car.invalidVal;
                Car.deleteCar(regNumber);
            }
            else if(choice == 4) {
                break;
            }
            else continue;
        }
    }
}