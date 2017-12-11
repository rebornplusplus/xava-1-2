import java.io.*;

public class FileOp {
    private static final String INPUT_FILE = "H:/627/Offline-1/src/in.txt";
    private static final String OUTPUT_FILE = "H:/627/Offline-1/src/in.txt";

    public static void getCars() {
        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE));

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
}