import java.util.*;

class Main {
    public static void main(String[] args) {
        FileOp.getCars();

        while(true) {
			System.out.println("Car Warehouse Database System:");
            System.out.println("\t(1) Search Cars");
            System.out.println("\t(2) Add Car");
            System.out.println("\t(3) Delete Car");
            System.out.println("\t(4) Exit System");

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
                        if(regNumber.equalsIgnoreCase("")) regNumber = Car.invalidVal;
						List<Car> myCars = Car.searchCars(regNumber, Car.invalidVal, Car.invalidVal);

						System.out.println("\n---------------------------------------");
						System.out.println("Search Results: " + myCars.size());
						for(Car c : myCars) System.out.println(c);
						System.out.println("---------------------------------------\n");
                    }
                    else if(searchChoice == 2) {
                        System.out.printf("Enter Car Make: ");
                        String carMake = scn.nextLine();
                        if(carMake.equalsIgnoreCase("")) carMake = Car.invalidVal;

                        System.out.printf("Enter Car Model (To see all write 'Any'): ");
                        String carModel = scn.nextLine();
                        if(carModel.equalsIgnoreCase("ANY")) carModel = Car.invalidVal;
						List<Car> myCars = Car.searchCars(Car.invalidVal, carMake, carModel);

						System.out.println("\n---------------------------------------");
						System.out.println("Search Results: " + myCars.size());
                        for(Car c : myCars) System.out.println(c);
						System.out.println("---------------------------------------\n");
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

				System.out.println("\n---------------------------------------");
                if(curCar.addCar()) System.out.println("Car added successfully");
                else System.out.println("There's already another car by that Registration Number");
				System.out.println("---------------------------------------\n");
            }
            else if(choice == 3) {
				System.out.printf("Enter Registration Number: ");
                String regNumber = scn.nextLine();
                if(regNumber.equalsIgnoreCase("")) regNumber = Car.invalidVal;
				System.out.println("\n---------------------------------------");
				if(Car.deleteCar(regNumber)) System.out.println("Car deleted successfully");
				else System.out.println("There's no such car");
				System.out.println("---------------------------------------\n");
            }
            else if(choice == 4) {
                break;
            }
            else continue;
        }

        FileOp.setCars();
    }
}