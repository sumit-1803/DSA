import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "Apple" -> System.out.println("Apple was detected");
            case "Mango" -> System.out.println("Mango was detected");
            default -> System.out.println("No fruit is detected");
        }
    }
}
