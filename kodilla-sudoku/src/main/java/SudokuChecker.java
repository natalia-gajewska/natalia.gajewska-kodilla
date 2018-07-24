import java.util.List;

public final class SudokuChecker {
    private SudokuChecker() {
    }


    public static boolean checkBoard(SudokuBoard sudokuBoard, SudokuDto sudokuDto) {

        if (isEmpty(sudokuBoard, sudokuDto)&& hasNoValueInRow(sudokuBoard, sudokuDto) && hasNoValueInColumn(sudokuBoard, sudokuDto) &&
                hasNoValueInGroup(sudokuBoard, sudokuDto)) {

            return true;

        } else {
            System.out.println("Try another number.");
            return false;
        }

    }

    private static boolean hasNoValueInRow(SudokuBoard sudokuBoard, SudokuDto sudokuDto) {
        List<SudokuElement> elements = sudokuBoard.getAllElementsInRow(sudokuDto.getRow());
        return elements.stream().filter(e -> e.getValue() == sudokuDto.getValue()).count() == 0;

    }

    private static boolean hasNoValueInColumn(SudokuBoard sudokuBoard, SudokuDto sudokuDto) {
        List<SudokuElement> elements = sudokuBoard.getAllElementsInCol(sudokuDto.getColumn());
        return elements.stream().filter(e -> e.getValue() == sudokuDto.getValue()).count() == 0;

    }

    private static boolean hasNoValueInGroup(SudokuBoard sudokuBoard, SudokuDto sudokuDto) {
        List<SudokuElement> elements = sudokuBoard.getAllElementsFromGroup(sudokuDto.getRow(), sudokuDto.getColumn());
        return elements.stream().filter(e -> e.getValue() == sudokuDto.getValue()).count() == 0;

    }

    private static boolean isEmpty(SudokuBoard board, SudokuDto dto){
        return board.getAllElements().stream().filter(e -> e.getRow()==dto.getRow()&&e.getColumn()==dto.getColumn())
                .anyMatch(e -> e.getValue()==0);

    }

}