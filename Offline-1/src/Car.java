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

        if(infoParts[0].equalsIgnoreCase("")) this.regNumber = invalidVal;
        else this.regNumber = infoParts[0];

        if(infoParts[1].equalsIgnoreCase("")) this.yearMade = Integer.parseInt(invalidVal);
        else this.yearMade = Integer.parseInt(infoParts[1]);

        this.color = new String[3];
        if(infoParts[2].equalsIgnoreCase("")) this.color[0] = invalidVal;
        else this.color[0] = infoParts[2];
        if(infoParts[3].equalsIgnoreCase("")) this.color[1] = invalidVal;
        else this.color[1] = infoParts[3];
        if(infoParts[4].equalsIgnoreCase("")) this.color[2] = invalidVal;
        else this.color[2] = infoParts[4];

        if(infoParts[5].equalsIgnoreCase("")) this.carMake = invalidVal;
        else this.carMake = infoParts[5];

        if(infoParts[6].equalsIgnoreCase("")) this.carModel = invalidVal;
        else this.carModel = infoParts[6];

        if(infoParts.length < 8 || infoParts[7].equalsIgnoreCase("")) this.price = Long.parseLong(invalidVal);
        else this.price = Long.parseLong(infoParts[7]);
    }

    public static List<Car> searchCars(String regNumber, String carMake, String carModel) {
        List<Car> myCars = new LinkedList<Car>();
        Iterator<Car> it = allCars.iterator();
        while(it.hasNext()) {
            Car curCar = it.next();

            int score = 0;
            if(curCar.regNumber.equalsIgnoreCase(regNumber) || regNumber.equalsIgnoreCase(invalidVal)) ++score;
            if(curCar.carMake.equalsIgnoreCase(carMake) || carMake.equalsIgnoreCase(invalidVal)) ++score;
            if(curCar.carModel.equalsIgnoreCase(carModel) || carModel.equalsIgnoreCase(invalidVal)) ++score;
            if(score == 3) myCars.add(curCar);
        }

        return myCars;
    }

    public Boolean addCar() {
        for(Car c : allCars) {
        	if(c.regNumber.equalsIgnoreCase(this.regNumber)) {
        		return false;
			}
		}
		allCars.add(this);
        return true;
    }

    public static Boolean deleteCar(String regNumber) {
        Boolean found = false;
    	Iterator<Car> it = allCars.iterator();
        while(it.hasNext()) {
            Car curCar = it.next();
            if(curCar.regNumber.equalsIgnoreCase(regNumber)) {
				it.remove();
				found = true;
			}
        }
        return found;
    }

    public static List<Car> getAllCars() {
        return allCars;
    }

    @Override
    public String toString() {
        String ret = new String();
        if(!regNumber.equalsIgnoreCase(invalidVal)) ret += regNumber;
        ret += ",";
        if(yearMade != Integer.parseInt(invalidVal)) ret += yearMade;
        ret += ",";
        for(String c : color) {
        	if(!c.equalsIgnoreCase(invalidVal)) ret += c;
			ret += ",";
		}
		if(!carMake.equalsIgnoreCase(invalidVal)) ret += carMake;
		ret += ",";
		if(!carModel.equalsIgnoreCase(invalidVal)) ret += carModel;
		ret += ",";
		if(price != Long.parseLong(invalidVal)) ret += price;
		return ret;
    }
}