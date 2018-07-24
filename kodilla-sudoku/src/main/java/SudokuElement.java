import java.util.Objects;

public class SudokuElement {
    private int row;
    private int column;
    private int group;
    private int value = 0;

    public SudokuElement(int row, int column, int group) {
        this.row = row;
        this.column = column;
        this.group = group;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getGroup() {
        return group;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SudokuElement)) return false;
        SudokuElement that = (SudokuElement) o;
        return getRow() == that.getRow() &&
                getColumn() == that.getColumn() &&
                getGroup() == that.getGroup();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getRow(), getColumn(), getGroup());
    }
}