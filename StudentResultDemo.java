import java.util.Scanner;

// Base class for Student
class Student {
    protected String name;
    protected int academicScore;

    void readStudent(Scanner sc) {
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter academic score: ");
        academicScore = sc.nextInt();
        sc.nextLine(); // consume newline
    }

    void printStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Academic Score: " + academicScore);
    }
}

// Interface for Sports
interface Sports {
    void readSports(Scanner sc);
    void printSports();
}

// Result class inheriting Student and implementing Sports
class Result extends Student implements Sports {
    private int sportsScore;

    public void readSports(Scanner sc) {
        System.out.print("Enter sports score: ");
        sportsScore = sc.nextInt();
        sc.nextLine(); // consume newline
    }

    public void printSports() {
        System.out.println("Sports Score: " + sportsScore);
    }

    void printResult() {
        printStudent();
        printSports();
    }
}

// Main class
public class StudentResultDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        r.readStudent(sc);
        r.readSports(sc);

        System.out.println("\n--- Student Result ---");
        r.printResult();

        sc.close();
    }
}