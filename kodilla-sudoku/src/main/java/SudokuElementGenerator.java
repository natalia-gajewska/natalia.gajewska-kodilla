import java.util.Random;

public class SudokuElementGenerator {
    private SudokuDto sudokuDto;

    private Random random = new Random();

    public SudokuBoard generateSudoku(int times) {
        SudokuBoard sudokuBoard = SudokuPlant.createBoard();
        for (int i = 0; i < times; i++) {
            int row = random.nextInt(9);
            int column = random.nextInt(9);
            int value = random.nextInt(9);
            sudokuDto = new SudokuDto(row, column, value);
            if(SudokuChecker.checkBoard(sudokuBoard, sudokuDto)){
                System.out.println("Entered value "+value+" c:" + column +" row:"+row);
                sudokuBoard.addValue(sudokuDto);
            }else {
                i--;
            }
            System.out.println("It lives! " + i);
        }
        return sudokuBoard;
    }


}
