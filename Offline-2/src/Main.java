import java.util.Scanner;

public class Main {
    private static Scanner scn;

    static {
        scn = new Scanner(System.in);
    }

    private static int menuSelection() throws MyException {
        int ret;
        try {
            String line = scn.nextLine();
            ret = Integer.parseInt(line);
        } catch (Exception e) {
            throw  new MyException(true, false);
        }

        if(ret > 5 || ret < 1) throw new MyException(false, false);
        return ret;
    }

    private static double inputValue() throws MyException {
        double ret;
        try {
            String line = scn.nextLine();
            ret = Double.parseDouble(line);
        } catch (Exception e) {
            throw  new MyException(true, false);
        }

        if(ret < 0) throw new MyException(false, true);
        return ret;
    }

    public static void main(String[] args) {
        while(true) {
            System.out.println("Please select your choice:");
            System.out.println("1. Circle");
            System.out.println("2. Cylinder");
            System.out.println("3. Sphere");
            System.out.println("4. Square");
            System.out.println("5. Cube");

            int choice;
            try {
                choice = menuSelection();
            } catch(MyException e) {
                System.out.println(e);
                continue;
            }

            Shape ob;
            if(choice == 1) {
                double r;
                try {
                    System.out.printf("Enter radius: ");
                    r = inputValue();
                } catch (MyException e) {
                    System.out.println(e);
                    continue;
                }

                ob = new Circle(r);
                System.out.println(ob);
            }
            else if(choice == 2) {
                double r, h;
                try {
                    System.out.printf("Enter radius: ");
                    r = inputValue();
                    System.out.printf("Enter height: ");
                    h = inputValue();
                } catch (MyException e) {
                    System.out.println(e);
                    continue;
                }

                ob = new Cylinder(r, h);
                System.out.println(ob);
            }
            else if(choice == 3) {
                double r;
                try {
                    System.out.printf("Enter radius: ");
                    r = inputValue();
                } catch (MyException e) {
                    System.out.println(e);
                    continue;
                }

                ob = new Sphere(r);
                System.out.println(ob);
            }
            else if(choice == 4) {
                double a;
                try {
                    System.out.printf("Enter length: ");
                    a = inputValue();
                } catch (MyException e) {
                    System.out.println(e);
                    continue;
                }

                ob = new Square(a);
                System.out.println(ob);
            }
            else {
                double a;
                try {
                    System.out.printf("Enter length: ");
                    a = inputValue();
                } catch (MyException e) {
                    System.out.println(e);
                    continue;
                }

                ob = new Cube(a);
                System.out.println(ob);
            }
        }
    }
}
