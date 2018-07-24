import java.util.ArrayList;
import java.util.List;

public class SudokuPlant {

    private static final int BOARD_SIZE = 9;
    private static final int SMALL_BOARD_SIZE = (int) Math.sqrt(BOARD_SIZE );

    private SudokuPlant() {}

    public static SudokuBoard createBoard() {
        List<SudokuElement> elements = generateElements();
        return new SudokuBoard(elements);
    }

    private static List<SudokuElement> generateElements() {
        List<SudokuElement> elements = new ArrayList<>();
        for (int rowIndex = 0; rowIndex < BOARD_SIZE; rowIndex++) {
            elements.addAll(createElementsInRow(rowIndex));
        }
        return elements;
    }

    private static List<SudokuElement> createElementsInRow(int rowIndex) {
        List<SudokuElement> rowElements = new ArrayList<>();
        for (int colIndex = 0; colIndex < BOARD_SIZE; colIndex++) {
            int group = estimateGroup(colIndex, rowIndex);
            rowElements.add(new SudokuElement(rowIndex, colIndex, group));
        }
        return rowElements;
    }

    private static int estimateGroup(int colIndex, int rowIndex) {
        int colIntegerPart = colIndex / SMALL_BOARD_SIZE;
        int rowIntegerPart = rowIndex / SMALL_BOARD_SIZE;
        return colIntegerPart + rowIntegerPart * SMALL_BOARD_SIZE;
    }
}
