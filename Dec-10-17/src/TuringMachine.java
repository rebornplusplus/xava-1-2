public class TuringMachine {
    // you can have only one constructor of TuringMachine and that won't take any parameters
    // your code here

    private static TuringMachine instance;

    private TuringMachine() {
        // nothing to do so far :3
    }

    static {
        instance = new TuringMachine();
    }

    public static TuringMachine getInstance() {
        return instance;
    }

    public void decrypt(AirStrike strike) {
        String encryptedString = strike.getEncryptedString();

        char decrypted[] = new char[encryptedString.length()];
        for(int i=0; i<encryptedString.length(); ++i) {
            decrypted[i] = (char) (encryptedString.charAt(i) + 1);
        }

        String decryptedString = new String(decrypted);
        strike.setDecryptedString(decryptedString); // set decryptedString here
    }
}

