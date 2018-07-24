import java.util.Scanner;

public class SudokuPlayer {
    private Scanner scanner = new Scanner(System.in);
    private final static int INDEX_CORRECTOR = 1;

    public SudokuDto makeMove() {

        System.out.println("Row?");
        int row = fetchNumber() - INDEX_CORRECTOR;
        System.out.println("Column?");
        int column = fetchNumber() - INDEX_CORRECTOR;
        System.out.println("Number?");
        int number = fetchNumber();

        return new SudokuDto(row, column, number);

    }

    private int fetchNumber() {

        String num = "";
        while (!num.matches("[1-9]")) {
            System.out.println("Enter value from 1 to 9");
            num = scanner.next();
        }
        return Integer.valueOf(num);


    }

}