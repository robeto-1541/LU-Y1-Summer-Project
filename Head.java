public class Head extends GamePiece
{
    public char colour;
    public Head(int argposx, int argposy, char argcolour)
    {
        posx = argposx;
        posy = argposy;
        colour = argcolour;
    }

    public bool isNextToBall()
    {
        for (int i = 0; i < 4; i++)
        {

        }
    }

    public void headStack()
    {
        if (isNextToBall())
        {

        }
    }
}