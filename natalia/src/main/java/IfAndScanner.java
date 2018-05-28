import java.util.Scanner;

public class IfAndScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Podaj swój wiek");
        int age = scanner.nextInt();

        if (age >=18) {
            System.out.println("Jesteś osobą pełnoletnią");
        }

        else {
            System.out.println ("Jesteś dzieckiem");

            }
        }
    }
