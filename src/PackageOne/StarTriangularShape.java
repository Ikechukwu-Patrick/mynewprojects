package PackageOne;

import java.util.Scanner;
    public class StarTriangularShape {
        public static void main(String[] argument) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of rows for the triangle: ");
            int numRows = scanner.nextInt();

            for (int i = 1; i <= numRows; i++) {
                for (int j = 1; j <= numRows - i; j++) {
                    System.out.print("  ");
                }

                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

