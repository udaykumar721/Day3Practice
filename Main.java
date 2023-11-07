// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the coordinates of the first point (x1 y1):");
                double x1 = scanner.nextDouble();
                double y1 = scanner.nextDouble();
                System.out.println("Enter the coordinates of the second point (x2 y2):");
                double x2 = scanner.nextDouble();
                double y2 = scanner.nextDouble();
                double length = calculateLineLength(x1, y1, x2, y2);
                System.out.println("The length of the line is: " + length);
            }

            public static double calculateLineLength(double x1, double y1, double x2, double y2) {
                double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                return length;
            }
    }
