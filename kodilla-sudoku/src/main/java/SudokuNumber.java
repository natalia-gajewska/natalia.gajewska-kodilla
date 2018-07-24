public class SudokuNumber {

    private final SudokuBoard sudokuBoard;

    public SudokuNumber(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    public void printBoard() {
        for (int i = 0; i < 9; i++) {
            sudokuBoard.getAllElementsInRow(i).stream()
                    .map(e -> e.getValue()+"|")
                    .forEach(System.out::print);
            System.out.println();

        }
    }
}
