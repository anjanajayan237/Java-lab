import java.util.Arrays;
import java.util.Scanner;

public class palindrome{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // i. Check whether a given string is palindrome or not
        System.out.print("Enter a string to check palindrome: ");
        String str = sc.nextLine();

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        // ii. Sorting a given list of names in ascending order
        System.out.print("\nEnter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();  // consume newline

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Sorting names in ascending order
        Arrays.sort(names);

        System.out.println("\nNames in Ascending Order:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}
