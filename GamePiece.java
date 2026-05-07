public abstract class GamePiece 
{
    public int posx, posy;
    public String type;

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
