import javax.swing.JButton;

public class LevelSelectButton extends JButton {
    public LevelSelectButton(int lvlNum) {
        this.setText(String.format("Level %d", lvlNum));
    }
}