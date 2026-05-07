import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GameTile extends JButton
{
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
    public boolean selected = false;

    public GameTile(int argposx, int argposy)
    {
        posx = argposx;
        posy = argposy;
        this.setIcon(emptyIcon);
        
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // If this tile contains a tree, take no action
                // When no tile selected, select this tile
                // When this tile already selected, deselect
                // When other tile selected, check this tile is orthogonally adjacent to previous
                // If so, move piece in associated direction - see pieces for movement rules
                if (pieceHere instanceof GameTree || pieceHere instanceof SnowballStack)
                {
                    return;
                }
                if (selected)
                {
                    selected = false;
                    return;
                }
                else
                {
                    selected = true;
                }
            }
        });
    }

    public void setPiece(GamePiece piece)
    {
        pieceHere = piece;
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
}
