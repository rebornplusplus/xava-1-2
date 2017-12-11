import java.util.*;

class Car {
    public static String invalidVal;
    private static List<Car> allCars;

    private String regNumber;
    private int yearMade;
    private String color[];
    private String carMake;
    private String carModel;
    private long price;

    static {
        invalidVal = "-1";
        allCars = new LinkedList<Car>();
    }

    Car(String allInfo, String splitChar) {
        String infoParts[] = allInfo.split(splitChar);
        assert infoParts.length == 8;

        if(infoParts[0].equals("")) this.regNumber = "-1";
        else this.regNumber = infoParts[0];

        if(infoParts[1].equals("")) this.yearMade = -1;
        else this.yearMade = Integer.parseInt(infoParts[1]);

        this.color = new String[3];
        if(infoParts[2].equals("")) this.color[0] = "-1";
        else this.color[0] = infoParts[2];
        if(infoParts[3].equals("")) this.color[1] = "-1";
        else this.color[1] = infoParts[3];
        if(infoParts[4].equals("")) this.color[2] = "-1";
        else this.color[2] = infoParts[4];

        if(infoParts[5].equals("")) this.carMake = "-1";
        else this.carMake = infoParts[5];

        if(infoParts[6].equals("")) this.carModel = "-1";
        else this.carModel = infoParts[6];

        if(infoParts.length < 8 || infoParts[7].equals("")) this.price = -1;
        else this.price = Long.parseLong(infoParts[7]);
    }

    public static List<Car> searchCars(String regNumber, String carMake, String carModel) {
        List<Car> myCars = new LinkedList<Car>();
        Iterator<Car> it = allCars.iterator();
        while(it.hasNext()) {
            Car curCar = it.next();

            int score = 0;
            if(curCar.regNumber.equals(regNumber) || regNumber.equals("-1")) ++score;
            if(curCar.carMake.equals(carMake) || carMake.equals("-1")) ++score;
            if(curCar.carModel.equals(carModel) || carModel.equals("-1")) ++score;
            if(score == 3) myCars.add(curCar);
        }

        return myCars;
    }

    public void addCar() {
        allCars.add(this);
    }

    public static void deleteCar(String regNumber) {
        Iterator<Car> it = allCars.iterator();
        while(it.hasNext()) {
            Car curCar = it.next();
            if(curCar.regNumber.equals(regNumber))
                it.remove();
        }
    }

    public static List<Car> getAllCars() {
        return allCars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNumber='" + regNumber + '\'' +
                ", yearMade=" + yearMade +
                ", color=" + Arrays.toString(color) +
                ", carMake='" + carMake + '\'' +
                ", carModel='" + carModel + '\'' +
                ", price=" + price +
                '}';
    }
}