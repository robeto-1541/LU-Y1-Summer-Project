public class Head extends GamePiece {
    public char colour;

    public Head(int argposx, int argposy, char argcolour) {
        posx = argposx;
        posy = argposy;
        colour = argcolour;
        type = String.format(colour + "Head");
    }

    public boolean isNextToBall() {
        for (int i = 0; i < 4; i++) {

        }
        return false;
    }

    public void headStack() {
        if (isNextToBall()) {

        }
    }
}