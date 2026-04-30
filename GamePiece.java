public class GamePiece 
{
    protected int posx, posy;

    public GamePiece()
    {
        
    }
    
    public void SetPos(int argposx, int argposy)
    {
        posx = argposx;
        posy = argposy;
    }

    public int GetPosx()
    {
        return posx;
    }

    public int getPosy()
    {
        return posy;
    }
}
