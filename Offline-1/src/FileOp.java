import java.io.*;

public class FileOp {
    private static final String SAVE_FILE = "cars.txt";

    public static void getCars() {
        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(SAVE_FILE));

            while(true) {
                line = br.readLine();
                if(line == null) break;

                Car curCar = new Car(line, ",");
                curCar.addCar();
            }

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setCars() {
    	try {
    		BufferedWriter bw = new BufferedWriter(new FileWriter(SAVE_FILE));

    		for(Car c : Car.getAllCars()) {
    			bw.write(c.toString());
    			bw.write("\n");
			}
			bw.close();
		} catch (Exception e) {
    		e.printStackTrace();
		}
	}
}