import java.util.Scanner;

/*
Write a Java program to print to take input and print first name and last name.
*/
public class practice1 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Input your first name: ");
        String fname = input.next();
        System.out.print("Input your last name: ");
        String lname = input.next();
        System.out.println();
        System.out.println("Hello \n"+fname+" "+lname);
    }
}
