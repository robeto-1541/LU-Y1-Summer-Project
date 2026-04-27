public class GameBoard 
{
    public GameBoard(int cols, int rows)
    {
        GameTile[][] tileArray = new GameTile[cols][rows];
        for (int i = 0; i < cols; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                tileArray[i][j] = new GameTile(i, j);
            }
        }
    }
}
