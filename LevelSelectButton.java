import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LevelSelectButton extends JButton
{
    public LevelSelectButton(int lvlNum)
    {
        this.setText(String.format("Level %d", lvlNum));
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });
    }
}