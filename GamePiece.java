public class GamePiece 
{
    private (int, int) pos;

    public GamePiece((int, int) argpos)
    {
        pos = argpos;
    }
    
    public void SetPos((int, int) argpos)
    {
        pos = argpos;
    }

    public (int, int) GetPos()
    {
        return pos;
    }
}
