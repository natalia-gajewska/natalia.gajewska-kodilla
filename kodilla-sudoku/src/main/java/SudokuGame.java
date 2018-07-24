public class SudokuGame {

    private SudokuBoard board;
    private SudokuPlayer player;
    private SudokuNumber printer;

    public SudokuGame(SudokuBoard board, SudokuPlayer player) {
        this.board = board;
        this.player = player;

        printer = new SudokuNumber(board);
    }

    public void play() {
        while(board.getAmountOfEmptyFields()>0){
            printer.printBoard();
            SudokuDto playerMove = player.makeMove();
            if(SudokuChecker.checkBoard(board, playerMove)){
                board.addValue(playerMove);
            }

        }

    }


}