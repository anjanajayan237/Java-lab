import java.util.Scanner;

class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first complex number
        System.out.print("Enter real part of first complex number: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double i1 = sc.nextDouble();

        // Input second complex number
        System.out.print("Enter real part of second complex number: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double i2 = sc.nextDouble();

        // Adding complex numbers
        double realSum = r1 + r2;
        double imagSum = i1 + i2;

        // Output
        System.out.println("Sum = " + realSum + " + " + imagSum + "i");

        sc.close();
    }
}
