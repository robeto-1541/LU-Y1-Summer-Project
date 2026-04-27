import javax.swing.*;
import java.awt.*;

public class GameWindow
{
    public GameWindow()
    {
        JFrame MainUI = new JFrame("Snow Problem!");
        JPanel MainPanel = new JPanel();
        GridLayout layout = new GridLayout(4,5);
        GameBoard gameBoard = new GameBoard(5, 4);
        MainPanel.setLayout(layout);
        MainUI.setContentPane(MainPanel);
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                MainPanel.add(gameBoard.tileArray[i][j]);
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