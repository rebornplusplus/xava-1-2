
import java.util.Scanner;

public class CommandLine {

    public static void main(String[] args) {
        for(String s:args)
            System.out.println(s+" ");
		
		System.out.println("Please enter your name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Hello "+name);
		System.out.println("Please enter your age: ");
		int age = sc.nextInt();
		System.out.println("Your age is "+age);
    }
    
}
