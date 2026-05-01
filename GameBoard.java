public class GameBoard 
{
    GameTile[][] tileArray;
    public GameBoard(int cols, int rows)
    {
        tileArray = new GameTile[cols][rows];
        for (int i = 0; i < cols; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                tileArray[i][j] = new GameTile(i, j);
            }
        }
    }

    public GameTile GetTile(int x, int y)
    {
        return (tileArray[x][y]);
    }
}
