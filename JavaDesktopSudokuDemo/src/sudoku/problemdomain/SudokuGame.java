package sudoku.problemdomain;
//serializable to read and write game data file to a file in the operating system easier
public class SudokuGame implements Serializable{
    //enum that well create it represent different states of the game
private final GameState gameState;
private final int [][] gridState;
public static final int GRID_BOUNDARY=9;

    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridState);
    }
}