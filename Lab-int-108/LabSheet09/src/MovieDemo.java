import java.util.Scanner;

public class MovieDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input movie id: ");
        String movieId = scanner.nextLine();

        System.out.print("Input movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Input director name: ");
        String directorName = scanner.nextLine();

        System.out.print("Input director e-mail: ");
        String directorEmail = scanner.nextLine();

        char directorGender;
        while (true) {
            System.out.print("Input director gender: ");
            directorGender = scanner.next().charAt(0);
            if (directorGender == 'm'  directorGender == 'M'  directorGender == 'f' || directorGender == 'F') break;
            System.out.println("Please input 'm' or 'f' only.");
        }

        Director director = new Director(directorName, directorEmail, directorGender);

        int theaterNo;
        while (true) {
            System.out.print("Input movie theater no. (1-15 only): ");
            theaterNo = scanner.nextInt();
            if (theaterNo >= 1 && theaterNo <= 15) break;
            System.out.println("Please input 1 - 15 only.");
        }

        Theater theater = new Theater(movieId, movieName, director, theaterNo);
        System.out.println(theater.toString());

        scanner.close();
    }
}