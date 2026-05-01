import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GameTile extends JButton
{
    ImageIcon icon = new ImageIcon("hole.png");
    int x, y;
    public GamePiece[] piecesHere = new GamePiece[3];

    public GameTile(int xpos, int ypos)
    {
        int x = xpos;
        int y = ypos;
        this.setIcon(icon);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {

            }
        });
    }
}
