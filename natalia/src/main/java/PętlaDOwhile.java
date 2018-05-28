import java.util.Scanner;

public class PętlaDOwhile { //podaj poprawną liczbę dopóki nie bedzie 10.

    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Podaj poprawną liczbę");
            number = scanner.nextInt(); //skaner odczytuje
        }
        while (number != 10); //dopóki liczba nie będzie równa 10
        System.out.println("Wpisałeś poprawną liczbę, gratki");
    }
}
