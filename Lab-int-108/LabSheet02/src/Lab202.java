import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int previousNumber = Integer.MIN_VALUE;
        int currentNumber;

        while (true) {
            System.out.print("Input number: ");
            currentNumber = scan.nextInt();

            // เช็คว่าเลขปัจจุบันน้อยกว่าเลขก่อนหน้า
            if (currentNumber < previousNumber) {
                break;
            }

            previousNumber = currentNumber;
        }
        System.out.println();
        System.out.println("BYE BYE");
        scan.close();
    }
}