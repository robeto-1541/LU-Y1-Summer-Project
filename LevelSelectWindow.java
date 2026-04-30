import javax.swing.*;
import java.awt.*;

public class LevelSelectWindow
{
    public LevelSelectWindow()
    {
        JFrame MainUI = new JFrame("Select a level!");
        JPanel MainPanel = new JPanel();
        GridLayout layout = new GridLayout(10,8);
        MainPanel.setLayout(layout);
        MainUI.setContentPane(MainPanel);
        JButton[] buttonArray = new JButton[80];
        for (int i = 0; i < 80; i++)
        {
            buttonArray[i] = new JButton(String.format("Level %d", i+1));
            MainPanel.add(buttonArray[i]);
        }
        MainUI.setSize(800,800);
        MainUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainUI.setResizable(false);
        MainUI.setVisible(true);
    }

    public static void main(String[] arguments)
    {
        LevelSelectWindow LevelWindow = new LevelSelectWindow();
    }
}

