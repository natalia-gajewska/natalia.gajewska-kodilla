import java.util.List;

public class SudokuRunner {

    public static void main(String[] args) {

        SudokuElementGenerator sudokuElementGenerator = new SudokuElementGenerator();
        SudokuBoard sudokuBoard = sudokuElementGenerator.generateSudoku(50);
        SudokuNumber sudokuNumber = new SudokuNumber(sudokuBoard);
        sudokuNumber.printBoard();
        List<SudokuElement> elementList = sudokuBoard.getAllElementsFromGroup(1,1);
        System.out.println();
        elementList.stream().forEach(e-> System.out.println("row "+e.getRow()+" column "+e.getColumn()+" group "+e.getGroup()));
    }

}
