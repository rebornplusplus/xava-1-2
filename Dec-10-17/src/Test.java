public class Test {
    public static void main(String[] args) {
        // TuringMachine machine = new TuringMachine();    will generate error
        TuringMachine machine = TuringMachine.getInstance();  // there will be only one object of TuringMachine
        //machine = new TuringMachine();  will generate error
        String encryptedString = "Fdql`mx+Eq`mbd+0+1+0831";
        AirStrike strike = new AirStrike(encryptedString);
        machine.decrypt(strike); // decryption is just the next character
        AirStrike.Builder builder = new AirStrike.Builder();
        builder.build(strike);  // Set the variables of AirStrike with decryptedString seperated by , in the order of source, destination, day, month, year
        System.out.println(strike.getSource());
        System.out.println(strike.getDestination());
        System.out.println(strike.getDay());
        System.out.println(strike.getMonth());
        System.out.println(strike.getYear());
    }
}