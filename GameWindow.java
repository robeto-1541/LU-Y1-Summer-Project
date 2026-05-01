import javax.swing.*;
import java.awt.*;

public class GameWindow
{
    public GameWindow()
    {
        JFrame MainUI = new JFrame("Snow Problem!");
        JPanel MainPanel = new JPanel();
        GridLayout layout = new GridLayout(4,5);
        GameBoard gameBoard = new GameBoard(4, 5);
        MainPanel.setLayout(layout);
        MainUI.setContentPane(MainPanel);
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                MainPanel.add(gameBoard.GetTile(i,j));
            }
        }
        MainUI.setSize(800,640);
        MainUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainUI.setResizable(false);
        MainUI.setVisible(true);
    }

    public static void main(String[] arguments)
    {
        GameWindow gameWindow = new GameWindow();
    }
}