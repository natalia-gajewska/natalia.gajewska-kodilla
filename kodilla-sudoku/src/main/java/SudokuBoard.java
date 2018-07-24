import java.util.List;
import java.util.stream.Collectors;

public class SudokuBoard {
    private List<SudokuElement> elements;


    public SudokuBoard(List<SudokuElement> elements) {
        this.elements = elements;
    }

    public List<SudokuElement> getAllElementsInRow(int rowIndex) {
        return elements.stream()
                .filter(e -> e.getRow() == rowIndex)
                .collect(Collectors.toList());
    }

    public List<SudokuElement> getAllElementsInCol(int colIndex) {
        return elements.stream()
                .filter(f -> f.getColumn() == colIndex)
                .collect(Collectors.toList());
    }

    public List<SudokuElement> getAllElements() {
        return elements;
    }

    public List<SudokuElement> getAllElementsFromGroup(int rowIndex, int colIndex) {
        int group = elements.stream()
                .filter(g -> g.getRow() == rowIndex && g.getColumn() == colIndex)
                .findAny().get().getGroup();

        return elements.stream()
                .filter(h -> h.getGroup() == group)
                .collect(Collectors.toList());
    }

    public void addValue(SudokuDto sudokuDto) {
        elements.stream()
                .filter(e -> e.getColumn() == sudokuDto.getColumn() && e.getRow() == sudokuDto.getRow())
                .forEach(e -> e.setValue(sudokuDto.getValue()));
    }

    public int getAmountOfEmptyFields() {
        return (int) elements.stream()
                .filter(e -> e.getValue() == 0).count();
    }
}
