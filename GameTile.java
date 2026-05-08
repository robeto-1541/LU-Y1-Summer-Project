import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GameTile extends JButton {
    // Tidy this dump...
    ImageIcon emptyIcon = new ImageIcon("Resources/hole.png");
    ImageIcon rearIcon = new ImageIcon("Resources/snowball_large.png");
    ImageIcon torsoIcon = new ImageIcon("Resources/snowball_small.png");
    ImageIcon stackIcon = new ImageIcon("Resources/snowman_stack.png");
    ImageIcon redHeadIcon = new ImageIcon("Resources/head_red.png");
    ImageIcon blueHeadIcon = new ImageIcon("Resources/head_blue.png");
    ImageIcon yellowHeadIcon = new ImageIcon("Resources/head_yellow.png");
    ImageIcon redManIcon = new ImageIcon("Resources/snowman_red.png");
    ImageIcon blueManIcon = new ImageIcon("Resources/snowman_blue.png");
    ImageIcon yellowManIcon = new ImageIcon("Resources/snowman_yellow.png");
    ImageIcon treeIcon = new ImageIcon("Resources/tree.png");

    int posx, posy;
    public GamePiece pieceHere;

    public GameTile(int argposx, int argposy) {
        posx = argposx;
        posy = argposy;
        this.setIcon(emptyIcon);
    }

    public void setPiece(GamePiece piece) {
        pieceHere = piece;
        if (pieceHere == null) {
            this.setIcon(emptyIcon);
            return;
        }
        switch (pieceHere.type) {
            case "Tree":
                this.setIcon(treeIcon);
                break;

            case "Stack":
                this.setIcon(stackIcon);
                break;

            case "rHead":
                this.setIcon(redHeadIcon);
                break;

            case "bHead":
                this.setIcon(blueHeadIcon);
                break;

            case "yHead":
                this.setIcon(yellowHeadIcon);
                break;

            case "rSnowman":
                this.setIcon(redManIcon);
                break;

            case "bSnowman":
                this.setIcon(blueManIcon);
                break;

            case "ySnowman":
                this.setIcon(yellowManIcon);
                break;

            case "Rear":
                this.setIcon(rearIcon);
                break;

            case "Torso":
                this.setIcon(torsoIcon);
                break;

            default:
                this.setIcon(emptyIcon);
                break;
        }
    }

    public void movePiece(GameTile target) {

        target.setPiece(pieceHere);
        this.setPiece(null);
    }
}
