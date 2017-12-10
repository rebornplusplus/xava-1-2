public class AirStrike {

    private String source;
    private String destination;
    private int day;
    private int month;
    private int year;
    // you can't have any public/private setter methods for the above 5 variables

    private String encryptedString;
    private String decryptedString;

    // you can't write any other constructor
    public AirStrike(String encryptedString) {
        this.encryptedString = encryptedString;
    }

    public String getEncryptedString() {
        return encryptedString;
    }

    public void setDecryptedString(String decryptedString) {
        this.decryptedString = decryptedString;
    }

    public String getDecryptedString() { return decryptedString; }

    public String getSource() { return source; }

    public String getDestination() { return destination; }

    public int getDay() { return day; }

    public int getMonth() { return month; }

    public int getYear() { return year; }

    private static class Builder {
        public Builder() { }

        public void build(AirStrike strike) {
            String decryptedString = strike.getDecryptedString();
            String decryptedParts[] = decryptedString.split(",");

            strike.source = decryptedParts[0];
            strike.destination = decryptedParts[1];
            strike.day = Integer.parseInt(decryptedParts[2]);
            strike.month = Integer.parseInt(decryptedParts[3]);
            strike.year = Integer.parseInt(decryptedParts[4]);
        }
    }
}
