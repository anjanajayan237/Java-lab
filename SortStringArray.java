import java.util.Arrays;
import java.util.Scanner;

class SortStringArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr); // sorting

        System.out.println("\nSorted strings:");
        for (String s : arr) {
            System.out.println(s);
        }

        sc.close();
    }
}
