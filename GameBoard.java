import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameBoard {
    GameTile[][] tileArray;
    GameTile selectedTile;

    public GameBoard(int cols, int rows) {
        tileArray = new GameTile[cols][rows];

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent)
            // If this tile contains a tree, take no action
            // When no tile selected, select this tile
            // When this tile already selected, deselect
            // When other tile selected, check this tile is orthogonally adjacent to
            // previous
            // If so, move piece in associated direction - see pieces for movement rules
            {
                System.out.println(selectedTile);
                for (int i = 0; i < cols; i++) {
                    for (int j = 0; j < rows; j++) {
                        if (actionEvent.getSource() == tileArray[i][j])
                        {
                            if (tileArray[i][j].pieceHere instanceof GameTree || tileArray[i][j].pieceHere instanceof Snowman ||selectedTile == tileArray[i][j])
                            {
                                selectedTile = null;
                                break;
                            }
                            else if (selectedTile == null)
                            {
                                selectedTile = tileArray[i][j];
                                break;
                            }
                            else if ((selectedTile.posx == i && (selectedTile.posy == j + 1 || selectedTile.posy == j - 1)) || (selectedTile.posy == j && (selectedTile.posx == i + 1 || selectedTile.posx == j - 1)))
                            {
                                // find direction for ball roll

                                selectedTile.movePiece(tileArray[i][j]);
                                selectedTile = null;
                                break;
                            }
                        }
                    }
                }
            }
        };

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                tileArray[i][j] = new GameTile(i, j);
                tileArray[i][j].addActionListener(actionListener);

            }
        }

    }

    public GameTile GetTile(int x, int y) {
        return (tileArray[x][y]);
    }

    private void RollBall(int xdir, int ydir)
    {

    }
}
