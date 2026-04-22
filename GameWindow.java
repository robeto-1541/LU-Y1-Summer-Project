import javax.swing.*;
import java.awt.*;

public class GameWindow
{
    public GameWindow()
    {
        JFrame MainUI = new JFrame("Snow Problem!");
        JPanel MainPanel = new JPanel();
        GridLayout layout = new GridLayout(4,5);
        MainPanel.setLayout(layout);
        MainUI.setContentPane(MainPanel);
        JButton[][] buttonArray = new JButton[5][4];
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                buttonArray[i][j] = new JButton();
                MainPanel.add(buttonArray[i][j]);
            }
        }
        MainUI.setSize(1000,1000);
        MainUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainUI.setVisible(true);
    }

    public static void main(String[] arguments)
    {
        GameWindow gameWindow = new GameWindow();
    }
}