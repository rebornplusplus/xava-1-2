/*
    The second class
    Couldn't figure out its name
 */

public class second {
    public static void main(String[] args) {
        Account ob1 = new Account("rough", 109);
        Account ob2 = new Account("627", 5247);

        ob1.creditBalance(5000);
        System.out.println("New balance: " + ob1.getBalance());
    }
}