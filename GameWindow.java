import javax.swing.*;
import java.awt.*;

public class GameWindow
{
    private GameBoard gameBoard;

    public GameWindow()
    {
        JFrame MainUI = new JFrame("Snow Problem!");
        JPanel MainPanel = new JPanel();
        GridLayout layout = new GridLayout(4,5);
        gameBoard = new GameBoard(4, 5);
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setLayout(layout);
        MainPanel.setLayout(layout);
        MainUI.setContentPane(MainPanel);
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                MainPanel.add(gameBoard.GetTile(i,j));
            }
        }

        //hardcoded level implementation...
        gameBoard.GetTile(0, 1).setPiece(new Rear());
        gameBoard.GetTile(3, 0).setPiece(new Head(0,0,'b'));
        gameBoard.GetTile(3, 4).setPiece(new Torso());
        gameBoard.GetTile(0, 4).setPiece(new GameTree(0,4));


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