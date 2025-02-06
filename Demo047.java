import java.util.Scanner;

public class Demo047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digitCount = 0;

        if (number == 0) {
            digitCount = 1;
        } else {
            while (number != 0) {
                number /= 10; 
                digitCount++; 
            }
        }

        System.out.println("Number of digits: " + digitCount);
        scanner.close();
    }
}
